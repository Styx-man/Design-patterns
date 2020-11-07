package ru.styxman.patterns.hw.six.bancomat.banknote;

/**
 * Banknote.
 */
public abstract class Banknote {

    protected CurrencyType currency;
    protected String value;

    public Banknote(CurrencyType currency, String value) {
        this.currency = currency;
        this.value = value;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public String getValue() {
        return value;
    }
}
