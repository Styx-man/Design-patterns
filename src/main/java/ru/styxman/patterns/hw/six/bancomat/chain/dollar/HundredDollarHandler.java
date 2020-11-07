package ru.styxman.patterns.hw.six.bancomat.chain.dollar;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;
import ru.styxman.patterns.hw.six.bancomat.banknote.BanknoteHandler;
import ru.styxman.patterns.hw.six.bancomat.banknote.usd.HundredDollarsBanknote;
import ru.styxman.patterns.hw.six.bancomat.chain.AbstractBanknoteHandler;

/**
 * HundredDollarHandler.
 */
public class HundredDollarHandler extends AbstractBanknoteHandler {

    public HundredDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return Integer.parseInt(getBanknote().getValue());
    }

    @Override
    protected Banknote getBanknote() {
        return new HundredDollarsBanknote();
    }
}
