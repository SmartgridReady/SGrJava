package communicator.async;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Processor {

    private final List<Executable> awaitList = new ArrayList<>();

    abstract void process(ProcessingType processingType);

    void process() {
        process(ProcessingType.PARALLEL);
        handleAwait();
    }

    public Processor await(Executable ... readExecs ) {
        awaitList.addAll(Arrays.asList(readExecs));
        return this;
    }

    private void handleAwait() {

        boolean isProcessing = true;
        while (isProcessing) {
            isProcessing = awaitList.stream()
                    .map(readExec -> readExec.getExecStatus()==ExecStatus.PROCESSING)
                    .collect(Collectors.toSet()).contains(true);

            if(isProcessing) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    isProcessing = false;
                }
            }
        }
    }
}
