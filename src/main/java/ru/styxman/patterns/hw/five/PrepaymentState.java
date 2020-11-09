package ru.styxman.patterns.hw.five;

/**
 * PrepaymentState.
 */
public class PrepaymentState implements State {

    @Override
    public void acceptCash(CopyMachineContext context) {
        System.out.println("Your balance is " + context.getBalance());
        context.setState(new ChooseInputDeviceState());
    }

    @Override
    public void chooseInputSource(CopyMachineContext context) {
        System.out.println("Deposit money on the balance");
    }

    @Override
    public void chooseDocument(CopyMachineContext context) {
        System.out.println("Deposit money on the balance");
    }

    @Override
    public void printDocument(CopyMachineContext context) {
        System.out.println("Deposit money on the balance");
    }

    @Override
    public void giveChange(CopyMachineContext context) {
        System.out.println("Deposit money on the balance");
    }
}
