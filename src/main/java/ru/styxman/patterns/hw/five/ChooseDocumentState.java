package ru.styxman.patterns.hw.five;

/**
 * ChooseDocumentState.
 */
public class ChooseDocumentState implements State {

    @Override
    public void acceptCash(CopyMachineContext context) {
        System.out.println("Your balance is " + context.getBalance());
    }

    @Override
    public void chooseInputSource(CopyMachineContext context) {
        System.out.println("You chose " + context.getSource().getDescription() + " as your input source");
    }

    @Override
    public void chooseDocument(CopyMachineContext context) {
        System.out.println("You chose to print document with name: " + context.getDocumentName());
        context.setState(new PrintState());
    }

    @Override
    public void printDocument(CopyMachineContext context) {
        System.out.println("You need to choose document to print first");
    }

    @Override
    public void giveChange(CopyMachineContext context) {
        System.out.println("Take your change: " + context.getBalance() + ", thanks for using our 'CopyMachine'");
        context.setBalance(0);
        context.setState(new PrepaymentState());
    }
}
