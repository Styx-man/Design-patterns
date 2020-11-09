package ru.styxman.patterns.hw.five;

/**
 * PrintState.
 */
public class PrintState implements State {

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
    }

    @Override
    public void printDocument(CopyMachineContext context) {
        context.setBalance(context.getBalance() - 10);
        if (context.getBalance() < 10) {
            System.out.println("Not enough money on the balance");
            context.setBalance(context.getBalance() + 10);
            context.setState(new FinishState());
        } else {
            System.out.println("Document " + context.getDocumentName() + " is printing, please wait");
            if (context.isFinished()) {
                context.setState(new FinishState());
            } else {
                context.setState(new ChooseDocumentState());
            }
        }
    }

    @Override
    public void giveChange(CopyMachineContext context) {
        System.out.println("Take your change: " + context.getBalance() + ", thanks for using our 'CopyMachine'");
        context.setBalance(0);
        context.setState(new PrepaymentState());
    }
}
