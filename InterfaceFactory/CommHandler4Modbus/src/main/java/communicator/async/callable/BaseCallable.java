package communicator.async.callable;

import communicator.async.process.ExecStatus;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;
import communicator.rest.exception.RestApiAuthenticationException;
import communicator.rest.exception.RestApiResponseParseException;
import communicator.rest.exception.RestApiServiceCallException;

import java.io.IOException;
import java.time.Instant;
import java.util.concurrent.Callable;

public abstract class BaseCallable<T> implements Callable<AsyncResult<T>> {

    protected final String profileName;
    protected final String datapointName;
    protected final AsyncResult<T> result = new AsyncResult<>();

    abstract void doFunctionCall()
            throws GenDriverException, RestApiResponseParseException, GenDriverModbusException,
            RestApiServiceCallException, RestApiAuthenticationException, GenDriverSocketException,
            IOException;

    public BaseCallable(String profileName, String datapointName) {
        this.profileName = profileName;
        this.datapointName = datapointName;
        this.result.setExecStatus(ExecStatus.IDLE);
    }

    @Override
    public AsyncResult<T> call() {
        result.setProfileName(profileName);
        result.setDatapointName(datapointName);
        result.setExecStatus(ExecStatus.PROCESSING);
        try {
            result.setRequestTime(Instant.now());
            doFunctionCall();
            result.setExecStatus(ExecStatus.SUCCESS);
            result.setResponseTime(Instant.now());
        } catch (Throwable t) {
            result.setResponseTime(Instant.now());
            result.setExecStatus(ExecStatus.ERROR);
            result.setThrowable(t);
        }
        return result;
    }

    public String getProfileName() {
        return profileName;
    }
    public String getDatapointName() {
        return datapointName;
    }
    public AsyncResult<T> getResult() {
        return result;
    }
}
