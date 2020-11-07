package ru.styxman.patterns.hw.six.bancomat.chain.dollar;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;
import ru.styxman.patterns.hw.six.bancomat.banknote.BanknoteHandler;
import ru.styxman.patterns.hw.six.bancomat.banknote.usd.FiftyDollarsBanknote;
import ru.styxman.patterns.hw.six.bancomat.chain.AbstractBanknoteHandler;

/**
 * FiftyDollarHandler.
 */
public class FiftyDollarHandler extends AbstractBanknoteHandler {

    public FiftyDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return Integer.parseInt(getBanknote().getValue());
    }

    @Override
    protected Banknote getBanknote() {
        return new FiftyDollarsBanknote();
    }
}
