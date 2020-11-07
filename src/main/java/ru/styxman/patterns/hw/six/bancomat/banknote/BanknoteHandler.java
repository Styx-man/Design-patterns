package ru.styxman.patterns.hw.six.bancomat.banknote;

/**
 * BanknoteHandler.
 */
public abstract class BanknoteHandler {

    private BanknoteHandler nextHandler;

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean validate(String banknote) {
        return nextHandler != null && nextHandler.validate(banknote);
    }

    public void getCash(String amount, CurrencyType currency) {
        if (nextHandler != null) {
            nextHandler.getCash(amount, currency);
        }
    }
}
