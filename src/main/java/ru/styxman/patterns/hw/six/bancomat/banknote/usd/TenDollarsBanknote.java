package ru.styxman.patterns.hw.six.bancomat.banknote.usd;

import static ru.styxman.patterns.hw.six.bancomat.banknote.CurrencyType.USD;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;

/**
 * TenDollarsBanknote.
 */
public class TenDollarsBanknote extends Banknote {

    public TenDollarsBanknote() {
        super(USD, "10");
    }
}
