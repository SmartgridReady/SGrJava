package communicator.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Sequence extends Processor {

    private static final Logger LOG = LoggerFactory.getLogger(Sequence.class);

    private final List<Processor> processorList = new ArrayList<>();

    @Override
    public void process(ProcessingType processingType) {
        LOG.info("Processing SEQUENCE");
        processorList.forEach(p -> p.process(ProcessingType.SEQUENCE));
    }

    public Sequence add(Processor processor) {
        processorList.add(processor);
        return this;
    }
}
