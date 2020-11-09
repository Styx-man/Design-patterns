package ru.styxman.patterns.hw.five;

/**
 * CopyMachine.
 */
public class CopyMachine {
    CopyMachineContext context;

    CopyMachine() {
        context = new CopyMachineContext();
    }

    public void acceptCash(int cash) {
        if (context.getBalance() != 0) {
            context.setBalance(context.getBalance() + cash);
        } else {
            context.setBalance(cash);
        }
        context.getState().acceptCash(context);
    }

    public void chooseInputSource(SourceType source) {
        context.setSource(source);
        context.getState().chooseInputSource(context);
    }

    public void chooseDocument(String documentName) {
        context.setDocumentName(documentName);
        context.getState().chooseDocument(context);
    }

    public void printDocument(boolean isItTheLastDocument) { //sorry for that.
        /* не успеваю написать нормальную проверку на нужно ли печатать еще один документ, поэтому запихнул в параметр метода, я знаю, что это очень плохо ): */
        context.setFinished(isItTheLastDocument);
        context.getState().printDocument(context);
    }

    public void getChange() {
        context.getState().giveChange(context);
    }
}
