package communicator.async.process;

import communicator.async.callable.AsyncResult;
import communicator.async.callable.DeviceWriteCallable;
import communicator.async.callable.WriteFunction;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;

public class WriteExec<V> extends Processor implements Executable {

    private static final Logger LOG = LoggerFactory.getLogger(WriteExec.class);

    private final DeviceWriteCallable<V> writeCallable;

    private final Scheduler scheduler;

    private Object finishedNotificationReceiver;

    private Disposable disposable;


    public WriteExec(String functionalProfileName, String datapointName, WriteFunction<V> writeFunction) {
       this(functionalProfileName, datapointName, writeFunction, Schedulers.io());
    }

    public WriteExec(String functionalProfileName, String datapointName, WriteFunction<V> writeFunction, Scheduler scheduler) {
        this.scheduler = scheduler;
        this.writeCallable = new DeviceWriteCallable<>(writeFunction, functionalProfileName, datapointName);
    }

    @Override
    public void process(ProcessingType processingType) {
    	  try {
              Observable<AsyncResult<V>> observable = Observable.fromCallable(writeCallable);
              if (ProcessingType.PARALLEL == processingType) {
                  LOG.info("WriteExec PARALLEL: {} - {}", writeCallable.getProfileName(), writeCallable.getProfileName());
                  disposable = observable.subscribeOn(scheduler).subscribe(this::handleSuccess, this::handleError);
              } else {
                  LOG.info("WriteExec SEQUENTIAL: {} - {}", writeCallable.getProfileName(), writeCallable.getDatapointName());
                  disposable = observable.subscribe(this::handleSuccess, this::handleError);
              }
          } catch (Throwable e) {
            handleError(e);
          }
    }
    public void setWriteValue(V value) {
    	this.writeCallable.setWriteValue(value);
    }
    
    private void handleSuccess(AsyncResult<V> result) {
        LOG.info("WriteExec RESULT {} - {} - {}", result.getProfileName(), result.getDatapointName(), result.getExecStatus().name());
        notifyFinished();
    }
    
    private void handleError(Throwable t) {
        AsyncResult<V> result = writeCallable.getResult();
        result.setResponseTime(Instant.now());
        result.setExecStatus(ExecStatus.ERROR);
        result.setThrowable(t);
        LOG.error("WriteExec RESULT - {} - {} - {}", result.getProfileName(), result.getDatapointName(), result.getThrowable());
        notifyFinished();
    }

    @Override
    public AsyncResult<V> getResult() {
        return writeCallable.getResult();
    }

	public ExecStatus getExecStatus() {
		 return getResult().getExecStatus();
	}

	public Throwable getExecThrowable() {
		return getResult().getThrowable();
	}

    public Instant getRequestTime() {
        return getResult().getRequestTime();
    }

    public Instant getResponseTime() {
        return getResult().getResponseTime();
    }

    public void cleanup() {
        if (disposable != null) {
            disposable.dispose();
        }
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
