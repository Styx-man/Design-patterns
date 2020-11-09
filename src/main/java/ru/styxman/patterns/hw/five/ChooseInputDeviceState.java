package ru.styxman.patterns.hw.five;

/**
 * ChooseInputDeviceState.
 */
public class ChooseInputDeviceState implements State {

    @Override
    public void acceptCash(CopyMachineContext context) {
        System.out.println("Your balance is " + context.getBalance());
    }

    @Override
    public void chooseInputSource(CopyMachineContext context) {
        System.out.println("You chose " + context.getSource().getDescription() + " as input source");
        context.setState(new ChooseDocumentState());
    }

    @Override
    public void chooseDocument(CopyMachineContext context) {
        System.out.println("You need to choose input source first");
    }

    @Override
    public void printDocument(CopyMachineContext context) {
        System.out.println("You need to choose input source first");
    }

    @Override
    public void giveChange(CopyMachineContext context) {
        System.out.println("Take your change: " + context.getBalance() + ", thanks for using our 'CopyMachine'");
        context.setBalance(0);
        context.setState(new PrepaymentState());
    }
}
