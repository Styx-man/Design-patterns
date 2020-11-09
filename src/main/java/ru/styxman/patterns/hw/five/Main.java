package ru.styxman.patterns.hw.five;

/**
 * Main.
 *
 * @author Denis_Lukashov
 */
public class Main {

    public static void main(String[] args) {
        CopyMachine copyMachine = new CopyMachine();

        System.out.println("\nLet's print it!\n");

        copyMachine.acceptCash(30);
        copyMachine.chooseInputSource(SourceType.USB_STICK);
        copyMachine.chooseDocument("design_patterns_cheat_shit.pdf");
        copyMachine.printDocument(false);
        copyMachine.chooseDocument("confidential_information.doc");
        copyMachine.printDocument(true);
        copyMachine.getChange();
    }
}
