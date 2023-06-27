package communicator.async.process;

public enum ExecStatus {
    IDLE,
    PROCESSING,
    SUCCESS,
    ERROR;

    public boolean isNotProcessed() {
        return this.equals(IDLE) || this.equals(PROCESSING);
    }

}
