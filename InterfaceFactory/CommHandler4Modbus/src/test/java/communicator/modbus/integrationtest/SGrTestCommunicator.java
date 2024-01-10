package communicator.modbus.integrationtest;

import communicator.common.api.StringValue;
import communicator.common.api.Value;
import communicator.common.helper.DataTypeHelper;
import communicator.modbus.impl.SGrModbusDevice;
import io.vavr.Tuple2;
import io.vavr.Tuple3;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.stream.Collectors;

public class SGrTestCommunicator extends JFrame {

    private JTree navigationTree;
    private DefaultTreeModel treeModel;

    private JPanel detailsPanel;

    private JTextField readValueField;
    private JTextField writeValueField;

    private final TestDevice testDevice = new TestDevice();

    // Custom TreeCellRenderer to customize node labels
    private static class CustomTreeCellRenderer extends DefaultTreeCellRenderer {
        @Override
        public Component getTreeCellRendererComponent(
                JTree tree, Object value, boolean selected, boolean expanded,
                boolean leaf, int row, boolean hasFocus) {

            super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

            DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
            Object userObject = node.getUserObject();

            if (userObject instanceof TestDevice.DataPointDescriptor) {
                setText(((TestDevice.DataPointDescriptor)userObject).dataPoint);
            } else {
                setText(userObject.toString());
            }
            return this;
        }
    }

    public SGrTestCommunicator() throws Exception {
        super("SGr Communicator");

        testDevice.init();

        createMainMenu();
        createNavigationTree();
        createDetailsPanel();

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(navigationTree), detailsPanel);
        splitPane.setDividerLocation(200);
        add(splitPane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createNavigationTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Functional profiles");

        java.util.List<TestDevice.DataPointDescriptor> dataPoints = testDevice.getDataPoints();
        Map<String, java.util.List<TestDevice.DataPointDescriptor>> fpMap = dataPoints.stream().collect(Collectors.groupingBy(dp -> dp.functionalProfile));

        fpMap.forEach((fpName, dpList) -> {
            DefaultMutableTreeNode fpNode = new DefaultMutableTreeNode(fpName);
            dpList.forEach(dp -> fpNode.add(new DefaultMutableTreeNode(dp)));
            root.add(fpNode);
        });

        treeModel = new DefaultTreeModel(root);
        navigationTree = new JTree(treeModel);
        navigationTree.setCellRenderer(new CustomTreeCellRenderer());
        navigationTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        navigationTree.addTreeSelectionListener(e -> onTreeSelectionChanged());
        navigationTree.revalidate();
        navigationTree.repaint();
    }

    private  void updateNavigationTree() {

        DefaultMutableTreeNode root = (DefaultMutableTreeNode)treeModel.getRoot();

        java.util.List<TestDevice.DataPointDescriptor> dataPoints = testDevice.getDataPoints();
        Map<String, java.util.List<TestDevice.DataPointDescriptor>> fpMap = dataPoints.stream().collect(Collectors.groupingBy(dp -> dp.functionalProfile));

        root.removeAllChildren();
        fpMap.forEach((fpName, dpList) -> {
            DefaultMutableTreeNode fpNode = new DefaultMutableTreeNode(fpName);
            dpList.forEach(dp -> fpNode.add(new DefaultMutableTreeNode(dp)));
            root.add(fpNode);
        });

        treeModel.reload();
    }

    private void createDetailsPanel() {
        detailsPanel = new JPanel();
        detailsPanel.setLayout(new GridBagLayout());
        detailsPanel.setPreferredSize(new Dimension(600, 60));

        JLabel detailsLabel = new JLabel("Details Panel");
        detailsLabel.setHorizontalAlignment(JLabel.CENTER);
        addComponent(detailsPanel, detailsLabel,0, 0);
    }

    private void onTreeSelectionChanged() {
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) navigationTree.getLastSelectedPathComponent();

        if (selectedNode!=null) {
            updateDetailsPanel(selectedNode);
        }
    }

    private void updateDetailsPanel(DefaultMutableTreeNode selectedNode) {

        detailsPanel.removeAll();

        addComponent(detailsPanel, createDatapointInfoPanel(selectedNode), 0, 0);
        addComponent(detailsPanel, createActionPanel(selectedNode), 0, 1 );

        detailsPanel.revalidate();
        detailsPanel.repaint();
    }

    private JPanel createDatapointInfoPanel(DefaultMutableTreeNode selectedNode) {

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridBagLayout());


        if (selectedNode.getUserObject() instanceof TestDevice.DataPointDescriptor) {

            TestDevice.DataPointDescriptor dpDescriptor = (TestDevice.DataPointDescriptor)selectedNode.getUserObject();

            JLabel fpLabel = new JLabel("Functional Profile:");
            JLabel fpName = new JLabel(dpDescriptor.functionalProfile);
            JLabel dpLabel = new JLabel("Data Point:");
            JLabel dpName = new JLabel(dpDescriptor.dataPoint);
            JLabel rwLabel = new JLabel("RW permission:");
            JLabel rwPermission = new JLabel((dpDescriptor.isReadable ? "R":"") + (dpDescriptor.isWritable ? "W":""));
            JLabel dpTypeLabel = new JLabel("Register type:");
            JLabel dpType = new JLabel(dpDescriptor.registerType.name());
            JLabel genericTypeLabel = new JLabel("Generic type:");
            JLabel genericType = new JLabel(DataTypeHelper.getGenDataTypeName(dpDescriptor.genericType));
            JLabel modubusTypeLabel = new JLabel("Modbus type;");
            JLabel modbusType = new JLabel(DataTypeHelper.getModbusDataTypeName(dpDescriptor.modbusType));

            addComponent(infoPanel, fpLabel,  0, 0);
            addComponent(infoPanel, fpName, 1, 0);
            addComponent(infoPanel, dpLabel, 0, 1);
            addComponent(infoPanel, dpName, 1, 1);
            addComponent(infoPanel, rwLabel, 0, 2);
            addComponent(infoPanel, rwPermission, 1, 2);
            addComponent(infoPanel, dpTypeLabel, 0, 3);
            addComponent(infoPanel, dpType, 1, 3);
            addComponent(infoPanel, genericTypeLabel, 0, 4);
            addComponent(infoPanel, genericType, 1, 4 );
            addComponent(infoPanel, modubusTypeLabel, 0, 5);
            addComponent(infoPanel, modbusType, 1, 5);
        } else {
           JLabel nameLabel = new JLabel(selectedNode.getUserObject().toString());
           addComponent(infoPanel, nameLabel, 0, 0);
        }
        return infoPanel;
    }

    private JPanel createActionPanel(DefaultMutableTreeNode selectedNode) {

        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new GridBagLayout());

        if (selectedNode.getUserObject() instanceof TestDevice.DataPointDescriptor) {

            TestDevice.DataPointDescriptor dpDescriptor = (TestDevice.DataPointDescriptor) selectedNode.getUserObject();
            int gridy = 0;
            if (dpDescriptor.isWritable) {
                addComponent(actionPanel, createWritePanel(selectedNode),0, gridy++);
            }
            if (dpDescriptor.isReadable) {
                addComponent(actionPanel, createReadPanel(selectedNode),0, gridy);
            }
        }
        return  actionPanel;
    }

    private JPanel createWritePanel(DefaultMutableTreeNode selectedNode) {
        JPanel writePanel = new JPanel(new GridBagLayout());

        JLabel writeLabel   = new JLabel("Write value:");
        writeValueField = new JTextField(32);
        JButton writeButton = new JButton("Write");
        writeButton.addActionListener(event -> onWriteButtonClicked(selectedNode));

        addComponent(writePanel, writeLabel, 0, 0);
        addComponent(writePanel, writeValueField, 1, 0);
        addComponent(writePanel, writeButton,  2, 0);

        return writePanel;
    }

    private void onWriteButtonClicked(DefaultMutableTreeNode selectedNode) {

        TestDevice.DataPointDescriptor dpDescriptor = (TestDevice.DataPointDescriptor) selectedNode.getUserObject();
        Value value = StringValue.of(writeValueField.getText());
        try {
            SGrModbusDevice device = testDevice.getTestSystem();

            device.setVal(dpDescriptor.functionalProfile, dpDescriptor.dataPoint, value);

            Value readVal = device.getVal(dpDescriptor.functionalProfile, dpDescriptor.dataPoint);
            readValueField.setText(readVal.getString());
        } catch (Exception e) {
            showMessageDialog("Write to target system failed.", e);
        }
    }

    private JPanel createReadPanel(DefaultMutableTreeNode selectedNode) {

        JPanel readPanel = new JPanel();

        JLabel readLabel = new JLabel("Read value:  ");
        readValueField = new JTextField(32);
        readValueField.setEditable(false);
        JButton readButton = new JButton("Read");
        readButton.addActionListener(event -> onReadButtonClicked(selectedNode));


        addComponent(readPanel, readLabel, 0, 0);
        addComponent(readPanel, readValueField, 1, 0);
        addComponent(readPanel, readButton, 2, 0);

        return readPanel;
    }

    private void onReadButtonClicked(DefaultMutableTreeNode selectedNode) {

        TestDevice.DataPointDescriptor dpDescriptor = (TestDevice.DataPointDescriptor) selectedNode.getUserObject();
        try {
            SGrModbusDevice device = testDevice.getTestSystem();
            Value readVal = device.getVal(dpDescriptor.functionalProfile, dpDescriptor.dataPoint);
            readValueField.setText(readVal.getString());
        } catch (Exception e) {
            showMessageDialog("Get value from device failed.", e);
        }
    }

    private void addComponent(JPanel panel, JComponent component, int gridx, int gridy) {

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(5, 5, 5, 5); // Optional: Add some padding
        panel.add(component, gbc);
    }

    private void showMessageDialog(String msg, Exception e) {

        JOptionPane.showMessageDialog(this, msg + "\n" + e.getMessage());
    }

    private void createMainMenu() {

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenuItem menuItem = new JMenuItem();
        menuItem.setAction(new AbstractAction("Open EI-XML...") {
            @Override
            public void actionPerformed(ActionEvent e) {
                onLoadEiXml();
            }
        });

        fileMenu.add(menuItem);
        this.setJMenuBar(menuBar);
    }

    private void onLoadEiXml() {

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                java.io.File selectedFile = fileChooser.getSelectedFile();
                testDevice.loadDeviceDescriptionFile(
                        selectedFile,
                        this::ipConnParamDialog,
                        this::comPortConnParamDialog);

                updateNavigationTree();
                navigationTree.revalidate();
                navigationTree.repaint();
            } catch (Exception e) {
                showMessageDialog("Failed to load EI-XML", e);
            }
        }
    }

    private Tuple2<String, Integer> ipConnParamDialog(String msg) {

        JPanel connParamPanel = new JPanel(new GridBagLayout());

        JLabel ipAddrLabel = new JLabel("IP Address:");
        JTextField ipAddr  = new JTextField(16);
        JLabel ipPortLabel = new JLabel("Port:");
        JTextField ipPort  = new JTextField(6);

        addComponent(connParamPanel, ipAddrLabel, 0, 0);
        addComponent(connParamPanel, ipAddr, 1, 0);
        addComponent(connParamPanel, ipPortLabel, 0, 1);
        addComponent(connParamPanel, ipPort, 1, 1);

        JOptionPane.showMessageDialog(
                this,
                connParamPanel,
                "IP Connection Parameters",
                JOptionPane.QUESTION_MESSAGE);

        return new Tuple2<>(ipAddr.getText(), Integer.parseInt(ipPort.getText()));
    }

    private Tuple3<String, Integer, Integer> comPortConnParamDialog(String msg) {

        JPanel connParamPanel = new JPanel(new GridBagLayout());

        JLabel comPortLabel = new JLabel("COM Port (ex. COM1):");
        JTextField comPort  = new JTextField(16);
        JLabel baudRateLabel = new JLabel("Baudrate:");
        JTextField baudRate  = new JTextField(6);
        JLabel unitIdentifierLabel = new JLabel("Modbus Unit ID:");
        JTextField unitIdentifier = new JTextField(6);

        addComponent(connParamPanel, comPortLabel, 0, 0);
        addComponent(connParamPanel, comPort, 1, 0);
        addComponent(connParamPanel, baudRateLabel, 0, 1);
        addComponent(connParamPanel, baudRate, 1, 1);
        addComponent(connParamPanel, unitIdentifierLabel, 0, 2);
        addComponent(connParamPanel, unitIdentifier, 1, 2);

        JOptionPane.showMessageDialog(
                this,
                connParamPanel,
                "COM Port connection",
                JOptionPane.QUESTION_MESSAGE);

        return new Tuple3<>(comPort.getText(), Integer.parseInt(baudRate.getText()), Integer.parseInt(unitIdentifier.getText()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new SGrTestCommunicator();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
