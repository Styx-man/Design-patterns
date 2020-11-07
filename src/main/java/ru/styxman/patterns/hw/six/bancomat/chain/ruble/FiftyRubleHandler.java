package ru.styxman.patterns.hw.six.bancomat.chain.ruble;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;
import ru.styxman.patterns.hw.six.bancomat.banknote.BanknoteHandler;
import ru.styxman.patterns.hw.six.bancomat.banknote.rub.FiftyRublesBanknote;
import ru.styxman.patterns.hw.six.bancomat.chain.AbstractBanknoteHandler;

/**
 * FiftyRubleHandler.
 */
public class FiftyRubleHandler extends AbstractBanknoteHandler {

    public FiftyRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return Integer.parseInt(getBanknote().getValue());
    }

    @Override
    protected Banknote getBanknote() {
        return new FiftyRublesBanknote();
    }
}
