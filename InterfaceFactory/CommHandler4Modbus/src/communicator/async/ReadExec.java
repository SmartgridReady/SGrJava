package communicator.async;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;

public class ReadExec<R> extends Processor implements Executable {

    private static final Logger LOG = LoggerFactory.getLogger(ReadExec.class);

    private final String functionalProfileName;
    private final String datapointName;

    private final ReadFunction<R> readFunction;

    private ExecStatus execStatus;
    private Throwable execThrowable;
    private R readValue;
    private Disposable disposable;

    private Instant requestTime;

    private Instant responseTime;

    public ReadExec(String functionalProfileName, String datapointName, ReadFunction<R> readFunction) {
        this.functionalProfileName = functionalProfileName;
        this.datapointName = datapointName;
        this.readFunction = readFunction;
        this.execStatus = ExecStatus.IDLE;
    }

    @Override
    public void process(ProcessingType processingType) {
        try {
            execStatus = ExecStatus.PROCESSING;
            requestTime = Instant.now();
            if (ProcessingType.PARALLEL == processingType) {
                LOG.info("ReadExec PARALLEL: {} - {}", functionalProfileName, datapointName);
                Observable<R> observable = Observable.just(readFunction.apply(functionalProfileName, datapointName));
                disposable = observable.subscribeOn(Schedulers.io()).subscribe(this::handleSuccess, this::handleError);
            } else {
                LOG.info("ReadExec SEQUENTIAL: {} - {}", functionalProfileName, datapointName);
                handleSuccess(readFunction.apply(functionalProfileName, datapointName));
            }
        } catch (Exception e) {
           handleError(e);
        }
    }

    public void handleSuccess(R readValue) {
        LOG.info("ReadExec RESULT {} - {} SUCCESS, value={}", functionalProfileName, datapointName, readValue);
        this.responseTime = Instant.now();
        this.execStatus = ExecStatus.SUCCESS;
        this.readValue = readValue;
    }
    
    public void handleError(Throwable t) {
    	 LOG.error("ReadExec RESULT {} - {} ERROR", functionalProfileName, datapointName);
         this.responseTime = Instant.now();
         execStatus = ExecStatus.ERROR;
         execThrowable = t;
    }

    public R getReadValue() {
        return readValue;
    }

    public ExecStatus getExecStatus() {
        return execStatus;
    }
    
    public Throwable getExecThrowable() {
    	return execThrowable;
    }

    public void cleanup() {
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public Instant getRequestTime() {
        return requestTime;
    }

    public Instant getResponseTime() {
        return responseTime;
    }

    @Override
    public String toString() {
        return String.format("%s - %s = %s : status=%s - error=%s, requestTime=%s, responseTime=%s",
                functionalProfileName, datapointName, readValue, execStatus.name(), execThrowable, requestTime, responseTime);
    }
}
