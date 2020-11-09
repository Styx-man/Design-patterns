package ru.styxman.patterns.hw.five;

/**
 * FinishState.
 */
public class FinishState implements State {

    @Override
    public void acceptCash(CopyMachineContext context) {
        System.out.println("hmmm");
    }

    @Override
    public void chooseInputSource(CopyMachineContext context) {

    }

    @Override
    public void chooseDocument(CopyMachineContext context) {

    }

    @Override
    public void printDocument(CopyMachineContext context) {

    }

    @Override
    public void giveChange(CopyMachineContext context) {
        System.out.println("Take your change: " + context.getBalance() + ", thanks for using our 'CopyMachine'");
        context.setBalance(0);
        context.setState(new PrepaymentState());
    }
}
