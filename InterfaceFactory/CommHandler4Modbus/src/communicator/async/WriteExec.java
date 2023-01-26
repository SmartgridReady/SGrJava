package communicator.async;

import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;
import communicator.restapi.exception.RestApiAuthenticationException;
import communicator.restapi.exception.RestApiResponseParseException;
import communicator.restapi.exception.RestApiServiceCallException;
import io.reactivex.rxjava3.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.io.IOException;
import java.time.Instant;

public class WriteExec<V> extends Processor implements Executable {

    private static final Logger LOG = LoggerFactory.getLogger(WriteExec.class);

    private final String functionalProfileName;
    private final String datapointName;
    private final WriteFunctionWrapper<V> writeFunction;
    private V value;
    private ExecStatus execStatus;
    private Throwable execThrowable;

    private Instant requestTime;

    private Instant responseTime;

    private Disposable disposable;
    
    private interface WriteFunctionWrapper<V> {
    	 String apply(String profileName, String dataPointName, V value) throws
                GenDriverException, GenDriverModbusException, GenDriverSocketException, IOException,
                RestApiServiceCallException, RestApiAuthenticationException, RestApiResponseParseException;
    }

    public WriteExec(String functionalProfileName, String datapointName, WriteFunction<V> writeFunction) {
        this.functionalProfileName = functionalProfileName;
        this.datapointName = datapointName;
        // We need to convert the write function to a function that returns a value.
        this.writeFunction = (profileName, dataPointName, value) -> {
            writeFunction.apply(functionalProfileName, datapointName, value);
            return "OK";
        };
    }

    @Override
    public void process(ProcessingType processingType) {
    	
    	
    	  try {
              execStatus = ExecStatus.PROCESSING;
              requestTime = Instant.now();
              if (ProcessingType.PARALLEL == processingType) {
                  LOG.info("WriteExec PARALLEL: {} - {}", functionalProfileName, datapointName);
                  Observable<String> observable = Observable.just(writeFunction.apply(functionalProfileName, datapointName, value));
                  disposable = observable.subscribeOn(Schedulers.io()).subscribe(this::handleSuccess, this::handleError);
              } else {
                  LOG.info("WriteExec SEQUENTIAL: {} - {}", functionalProfileName, datapointName);
                  handleSuccess(writeFunction.apply(functionalProfileName, datapointName, value));
              }
          } catch (Exception e) {
            handleError(e);
          }
    }
    
    void setValue(V value) {
    	this.value = value;
    }
    
    private void handleSuccess(String noRetVal) {
        LOG.info("WriteExec RESULT {} - {} SUCCESS", functionalProfileName, datapointName);
        this.responseTime = Instant.now();
        this.execStatus = ExecStatus.SUCCESS;
    }
    
    private void handleError(Throwable t) {
    	 LOG.error("WriteExec RESULT {} - {} ERROR", functionalProfileName, datapointName);
         this.responseTime = Instant.now();
         execStatus = ExecStatus.ERROR;
         execThrowable = t;
    }

	public ExecStatus getExecStatus() {
		return execStatus;
	}

	public Throwable getExecThrowable() {
		return execThrowable;
	}

    public Instant getRequestTime() {
        return requestTime;
    }

    public Instant getResponseTime() {
        return responseTime;
    }

    public void cleanup() {
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s = %s : status=%s - error=%s, requestTime=%s, responseTime=%s",
                functionalProfileName, datapointName, value, execStatus.name(), execThrowable, requestTime, responseTime);
    }
}
