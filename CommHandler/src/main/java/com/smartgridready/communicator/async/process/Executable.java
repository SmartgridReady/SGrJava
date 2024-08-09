package com.smartgridready.communicator.async.process;

import com.smartgridready.communicator.async.callable.AsyncResult;

public interface Executable {
    ExecStatus getExecStatus();
    void setFinishedNotificationReceiver(Object aReceiver);
    AsyncResult<?> getResult();
}
