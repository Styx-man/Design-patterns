package ru.styxman.patterns.hw.six.bancomat;

import ru.styxman.patterns.hw.six.bancomat.banknote.BanknoteHandler;
import ru.styxman.patterns.hw.six.bancomat.banknote.CurrencyType;
import ru.styxman.patterns.hw.six.bancomat.chain.dollar.FiftyDollarHandler;
import ru.styxman.patterns.hw.six.bancomat.chain.dollar.FiveDollarHandler;
import ru.styxman.patterns.hw.six.bancomat.chain.dollar.HundredDollarHandler;
import ru.styxman.patterns.hw.six.bancomat.chain.dollar.TenDollarHandler;
import ru.styxman.patterns.hw.six.bancomat.chain.dollar.TwentyDollarHandler;
import ru.styxman.patterns.hw.six.bancomat.chain.ruble.FiftyRubleHandler;
import ru.styxman.patterns.hw.six.bancomat.chain.ruble.FiveHundredRubleHandler;
import ru.styxman.patterns.hw.six.bancomat.chain.ruble.HundredRubleHandler;
import ru.styxman.patterns.hw.six.bancomat.chain.ruble.ThousandRubleHandler;

/**
 * CashMachine.
 */
class CashMachine {
    private BanknoteHandler handler;

    public CashMachine() {
        handler = new FiveDollarHandler(null);
        handler = new TenDollarHandler(handler);
        handler = new TwentyDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler(handler);
        handler = new FiftyRubleHandler(handler);
        handler = new HundredRubleHandler(handler);
        handler = new FiveHundredRubleHandler(handler);
        handler = new ThousandRubleHandler(handler);
    }

    public boolean validate(String banknote) {
        return handler.validate(banknote);
    }

    public void getCash(String amount, CurrencyType currency) {
        handler.getCash(amount, currency);
    }

}
