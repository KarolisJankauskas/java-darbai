package ibank;

import java.math.BigDecimal;
import java.util.UUID;

public class AccountImpl implements Account {
    private final String accountNumber;
    private final String holderName;
    private BigDecimal balance;

    public AccountImpl(String holderName, BigDecimal initialBalance) {
        this.accountNumber = UUID.randomUUID().toString(); // Generate unique account number
        this.holderName = holderName;
        this.balance = initialBalance != null ? initialBalance : BigDecimal.ZERO;
    }

    @Override
    public String getNumber() {
        return accountNumber;
    }

    @Override
    public String getHolderName() {
        return holderName;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(BigDecimal amount) {
        if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0 && balance.add(amount).compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.subtract(amount);
            return true;
        }
        return false;
    }
}
