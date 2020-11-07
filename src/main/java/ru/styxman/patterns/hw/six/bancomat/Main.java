package ru.styxman.patterns.hw.six.bancomat;

import static ru.styxman.patterns.hw.six.bancomat.banknote.CurrencyType.RUB;
import static ru.styxman.patterns.hw.six.bancomat.banknote.CurrencyType.USD;

/**
 * Main.
 */
public class Main {

    public static void main(String[] args) {

        CashMachine cashMachine = new CashMachine();

        System.out.println("----новый ввод----");
        cashMachine.getCash("2003", USD);

        System.out.println("----новый ввод----");
        cashMachine.getCash("2075", USD);

        System.out.println("----новый ввод----");
        cashMachine.getCash("2073", USD);

        System.out.println("----новый ввод----");
        cashMachine.getCash("2050", RUB);

        System.out.println("----новый ввод----");
        cashMachine.getCash("5650", RUB);

        System.out.println("----новый ввод----");
        cashMachine.getCash("5653", RUB);
    }
}
