package ru.styxman.patterns.hw.six.bancomat.banknote.usd;

import static ru.styxman.patterns.hw.six.bancomat.banknote.CurrencyType.USD;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;

/**
 * TwentyDollarsBanknote.
 */
public class TwentyDollarsBanknote extends Banknote {

    public TwentyDollarsBanknote() {
        super(USD, "20");
    }
}
