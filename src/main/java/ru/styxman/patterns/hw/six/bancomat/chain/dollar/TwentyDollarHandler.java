package ru.styxman.patterns.hw.six.bancomat.chain.dollar;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;
import ru.styxman.patterns.hw.six.bancomat.banknote.BanknoteHandler;
import ru.styxman.patterns.hw.six.bancomat.banknote.usd.TwentyDollarsBanknote;
import ru.styxman.patterns.hw.six.bancomat.chain.AbstractBanknoteHandler;

/**
 * TwentyDollarHandler.
 */
public class TwentyDollarHandler extends AbstractBanknoteHandler {

    public TwentyDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return Integer.parseInt(getBanknote().getValue());
    }

    @Override
    protected Banknote getBanknote() {
        return new TwentyDollarsBanknote();
    }
}
