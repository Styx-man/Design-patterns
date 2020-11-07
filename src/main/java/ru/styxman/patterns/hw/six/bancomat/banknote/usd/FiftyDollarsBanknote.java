package ru.styxman.patterns.hw.six.bancomat.banknote.usd;

import static ru.styxman.patterns.hw.six.bancomat.banknote.CurrencyType.USD;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;

/**
 * FiftyDollarsBanknote.
 */
public class FiftyDollarsBanknote extends Banknote {

    public FiftyDollarsBanknote() {
        super(USD, "50");
    }
}
