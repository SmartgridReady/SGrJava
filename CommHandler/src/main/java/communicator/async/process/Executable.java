package communicator.async.process;

import communicator.async.callable.AsyncResult;

public interface Executable {
    ExecStatus getExecStatus();
    void setFinishedNotificationReceiver(Object aReceiver);
    AsyncResult<?> getResult();
}
