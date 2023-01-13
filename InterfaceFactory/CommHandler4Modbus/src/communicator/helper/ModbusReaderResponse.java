package communicator.helper;

import java.util.Arrays;

public class ModbusReaderResponse {
    private int[] mbregresp = new int[256];
    private boolean[] mbbitresp = new boolean[64];
    private boolean bGotRegisters = false;
    private boolean bGotDiscrete = false;

    public int[] getMbregresp() {
        return mbregresp;
    }
    
    public int[] getMbregresp(int offset, int len) {    
    	len = Math.min(mbregresp.length - offset, len); // will cut if offset + len > than array size
    	return Arrays.copyOfRange(mbregresp, offset, offset + len );
    }

    public void setMbregresp(int[] mbregresp) {
        this.mbregresp = mbregresp;
        this.bGotRegisters = true;
    }            

    public boolean[] getMbbitresp() {
        return mbbitresp;
    }
    
    public boolean[] getMbbitresp(int offset, int len) {    	
    	len = Math.min(mbregresp.length - offset, len); // will cut if offset + len > than array size    	
    	return Arrays.copyOfRange(mbbitresp, offset, offset + len);
    }    

    public void setMbbitresp(boolean[] mbbitresp) {
        this.mbbitresp = mbbitresp;
        this.bGotDiscrete = true;
    }

    public boolean isbGotRegisters() {
        return bGotRegisters;
    }

    public boolean isbGotDiscrete() {
        return bGotDiscrete;
    }
}
