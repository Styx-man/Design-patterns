package ru.styxman.patterns.hw.five;

/**
 * CopyMachineContext.
 */
public class CopyMachineContext {

    private int balance;
    private SourceType source;
    private String documentName;
    private boolean isFinished;
    private State state;

    public CopyMachineContext() {
        this.state = new PrepaymentState();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public SourceType getSource() {
        return source;
    }

    public void setSource(SourceType source) {
        this.source = source;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
