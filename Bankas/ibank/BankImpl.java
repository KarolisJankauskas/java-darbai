package ibank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankImpl implements Bank {
    private final List<Account> accounts = new ArrayList<>();

    @Override
    public int getNumberOfAccounts() {
        return accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return accounts.stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public Account openDebitAccount(String holderName) {
        if (getAccountByHolderName(holderName) != null) {
            return null; // Account already exists for the holder
        }
        Account account = new AccountImpl(holderName, BigDecimal.ZERO);
        accounts.add(account);
        return account;
    }

    @Override
    public Account openCreditAccount(String holderName, BigDecimal creditLimit) {
        if (getAccountByHolderName(holderName) != null || creditLimit == null || creditLimit.compareTo(BigDecimal.ZERO) <= 0) {
            return null; // Account already exists or invalid credit limit
        }
        Account account = new AccountImpl(holderName, creditLimit.negate());
        accounts.add(account);
        return account;
    }




    @Override
    public List<Account> getAllAccounts() {
        return new ArrayList<>(accounts); // Return a copy to prevent modification
    }

    @Override
    public Account getAccountByHolderName(String holderName) {
        return accounts.stream()
                .filter(acc -> acc.getHolderName().equals(holderName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Account getAccountByNumber(String accountNumber) {
        return accounts.stream()
                .filter(acc -> acc.getNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void closeAccount(Account account) {

    }
}
