package src;

import lt.itakademija.exam.Bank;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.test.BaseTest;

public class AccountTest extends BaseTest {
    @Override
    protected Bank createBank(CurrencyConverter currencyConverter) {

        return new BankImpl();
    }

    @Override
    protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        return null;
    }
}
