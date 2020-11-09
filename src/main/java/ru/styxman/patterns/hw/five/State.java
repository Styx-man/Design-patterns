package ru.styxman.patterns.hw.five;

/**
 * State.
 */
public interface State {

    void acceptCash(CopyMachineContext context);

    void chooseInputSource(CopyMachineContext context);

    void chooseDocument(CopyMachineContext context);

    void printDocument(CopyMachineContext context);

    void giveChange(CopyMachineContext context);
}
