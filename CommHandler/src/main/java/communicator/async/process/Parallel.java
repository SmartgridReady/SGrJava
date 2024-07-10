package communicator.async.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Parallel extends Processor {

    private static final Logger LOG = LoggerFactory.getLogger(Parallel.class);

    private final List<Processor> processorList = new ArrayList<>();

    @Override
    public void process(ProcessingType processingType) {
        LOG.info("Processing PARALLEL");
        processorList.parallelStream().forEach(
                p -> p.process(ProcessingType.PARALLEL));
    }

    public Parallel add(Processor processor) {
        processorList.add(processor);
        return this;
    }
}
