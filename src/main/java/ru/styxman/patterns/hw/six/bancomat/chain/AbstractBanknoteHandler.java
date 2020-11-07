package ru.styxman.patterns.hw.six.bancomat.chain;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;
import ru.styxman.patterns.hw.six.bancomat.banknote.BanknoteHandler;
import ru.styxman.patterns.hw.six.bancomat.banknote.CurrencyType;

/**
 * AbstractBanknoteHandler.
 */
public abstract class AbstractBanknoteHandler extends BanknoteHandler {
    protected AbstractBanknoteHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(String banknote) {
        if (banknote.equals(String.valueOf(getValue()))) {
            return true;
        }
        return super.validate(banknote);
    }

    @Override
    public void getCash(String amount, CurrencyType currency) {
        int amountInt = Integer.parseInt(amount);
        int banknoteValueInt = Integer.parseInt(getBanknote().getValue());
        int banknoteNumber = amountInt / banknoteValueInt;
        if (currency == CurrencyType.USD && validateAmount(amount, currency)) {
            if (amountInt % banknoteValueInt == 0) {
                System.out.println("Будет обналичено: " + banknoteNumber + " купюр(а) номиналом " + banknoteValueInt + " долларов");
            } else {
                if (banknoteNumber != 0) {
                    System.out.println("Будет обналичено: " + banknoteNumber + " купюр(а) номиналом " + banknoteValueInt + " долларов, a так же");
                }
                int amountLeft = amountInt - banknoteValueInt * banknoteNumber;
                super.getCash(Integer.toString(amountLeft), currency);
            }
        } else if (currency == CurrencyType.RUB && validateAmount(amount, currency)) {
            if (amountInt % banknoteValueInt == 0) {
                System.out.println("Будет обналичено: " + banknoteNumber + " купюр(а) номиналом " + banknoteValueInt + " рублей");
            } else {
                if (banknoteNumber != 0) {
                    System.out.println("Будет обналичено: " + banknoteNumber + " купюр(а) номиналом " + banknoteValueInt + " рублей, a так же");
                }
                int amountLeft = amountInt - banknoteValueInt * banknoteNumber;
                super.getCash(Integer.toString(amountLeft), currency);
            }
        } else {
            System.out.println("Введенная сумма не может быть обналичена");
        }
    }

    protected abstract int getValue();

    protected abstract Banknote getBanknote();

    private boolean validateAmount(String amount, CurrencyType currency) {
        int amountInt = Integer.parseInt(amount);
        if (currency == CurrencyType.USD) {
            return amountInt % 100 % 50 % 20 % 10 % 5 == 0;
        } else if (currency == CurrencyType.RUB) {
            return amountInt % 1000 % 500 % 100 % 50 == 0;
        } else return false;
    }
}
