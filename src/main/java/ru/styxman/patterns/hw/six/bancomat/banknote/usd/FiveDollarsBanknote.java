package ru.styxman.patterns.hw.six.bancomat.banknote.usd;

import static ru.styxman.patterns.hw.six.bancomat.banknote.CurrencyType.USD;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;

/**
 * FiveDollarsBanknote.
 */
public class FiveDollarsBanknote extends Banknote {

    public FiveDollarsBanknote() {
        super(USD, "5");
    }
}
