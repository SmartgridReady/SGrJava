package communicator.async.process;

import communicator.async.callable.AsyncResult;
import communicator.async.callable.ReadFunction;
import communicator.async.callable.DeviceReadCallable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;

public class ReadExec<R> extends Processor implements Executable {

    private static final Logger LOG = LoggerFactory.getLogger(ReadExec.class);
    private final DeviceReadCallable<R> deviceCallable;

    private final Scheduler scheduler;

    private Object finishedNotificationReceiver;

    private Disposable disposable;
    public ReadExec(String functionalProfileName, String datapointName, ReadFunction<R> readFunction) {
        this(functionalProfileName, datapointName, readFunction, Schedulers.io());
    }

    public ReadExec(String functionalProfileName, String datapointName, ReadFunction<R> readFunction, Scheduler scheduler) {
        this.scheduler = scheduler;
        this.deviceCallable = new DeviceReadCallable<>(readFunction, functionalProfileName, datapointName);
    }

    @Override
    public void process(ProcessingType processingType) {

        try {
            Observable<AsyncResult<R>> observable = Observable.fromCallable(deviceCallable);
            if (ProcessingType.PARALLEL == processingType) {
                LOG.info("ReadExec PARALLEL: {}", deviceCallable);
                disposable = observable.subscribeOn(scheduler).subscribe(this::handleSuccess, this::handleError);
            } else {
                LOG.info("ReadExec SEQUENTIAL: {}", deviceCallable);
                disposable = observable.subscribe(this::handleSuccess, this::handleError);
            }
        } catch (Exception e) {
           handleError(e);
        }
    }

    public void handleSuccess(AsyncResult<R> result) {
        LOG.info("ReadExec RESULT {} - {} SUCCESS, value={}", result.getProfileName(), result.getDatapointName(), result.getValue());
        notifyFinished();
    }
    
    public void handleError(Throwable t) {
        LOG.error("ReadExec RESULT {} - {} ERROR", deviceCallable.getResult().getProfileName(), deviceCallable.getResult().getDatapointName());
        notifyFinished();
    }

    @Override
    public AsyncResult<R> getResult() {
        return deviceCallable.getResult();
    }

    public R getReadValue() {
        return getResult().getValue();
    }

    public ExecStatus getExecStatus() {
        return getResult().getExecStatus();
    }
    
    public Throwable getExecThrowable() {
    	return getResult().getThrowable();
    }

    public void cleanup() {
        if (disposable != null) {
            disposable.dispose();
        }
    }
    public Instant getRequestTime() {
        return getResult().getRequestTime();
    }

    public Instant getResponseTime() {
        return getResult().getResponseTime();
    }
    @Override
    public String toString() {
        return getResult().toString();
    }

    @Override
    public void setFinishedNotificationReceiver(Object notificationReceiver) {
        if (this.finishedNotificationReceiver == null) {
            this.finishedNotificationReceiver = notificationReceiver;
        } else {
            throw new IllegalStateException("Attempt to set finishedNotification receiver twice.");
        }
    }

    private void notifyFinished() {
        if (finishedNotificationReceiver != null) {
            synchronized (finishedNotificationReceiver) {
                finishedNotificationReceiver.notifyAll();
            }
        }
    }
}
