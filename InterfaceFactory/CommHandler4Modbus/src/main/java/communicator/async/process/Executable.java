package communicator.async.process;

public interface Executable {
    ExecStatus getExecStatus();
    void setFinishedNotificationReceiver(Object aReceiver);
}
