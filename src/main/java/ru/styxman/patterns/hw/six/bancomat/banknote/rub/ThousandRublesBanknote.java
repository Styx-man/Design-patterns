package ru.styxman.patterns.hw.six.bancomat.banknote.rub;

import static ru.styxman.patterns.hw.six.bancomat.banknote.CurrencyType.RUB;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;

/**
 * ThousandRublesBanknote.
 */
public class ThousandRublesBanknote extends Banknote {

    public ThousandRublesBanknote() {
        super(RUB, "1000");
    }
}
