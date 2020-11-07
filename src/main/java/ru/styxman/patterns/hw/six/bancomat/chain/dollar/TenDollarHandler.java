package ru.styxman.patterns.hw.six.bancomat.chain.dollar;

import ru.styxman.patterns.hw.six.bancomat.banknote.Banknote;
import ru.styxman.patterns.hw.six.bancomat.banknote.BanknoteHandler;
import ru.styxman.patterns.hw.six.bancomat.banknote.usd.TenDollarsBanknote;
import ru.styxman.patterns.hw.six.bancomat.chain.AbstractBanknoteHandler;

/**
 * TenDollarHandler.
 */
public class TenDollarHandler extends AbstractBanknoteHandler {

    public TenDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return Integer.parseInt(getBanknote().getValue());
    }

    @Override
    protected Banknote getBanknote() {
        return new TenDollarsBanknote();
    }
}
