import java.math.BigDecimal;
import java.util.*;

public class SimpleBank implements Bank {
    private final Map<String, Account> accountsByNumber = new HashMap<>();
    private final Map<String, Account> accountsByHolderName = new HashMap<>();

    @Override
    public int getNumberOfAccounts() {
        return accountsByNumber.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return accountsByNumber.values().stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return accountsByNumber.values();
    }

    @Override
    public Account openDebitAccount(String accountHolderName) {
        if (accountsByHolderName.containsKey(accountHolderName)) {
            return null;
        }
        Account account = new DebitAccount(accountHolderName);
        accountsByNumber.put(account.getNumber(), account);
        accountsByHolderName.put(accountHolderName, account);
        return account;
    }

    @Override
    public Account openCreditAccount(String accountHolderName, BigDecimal creditLimit) {
        if (accountsByHolderName.containsKey(accountHolderName)) {
            return null;
        }
        Account account = new CreditAccount(accountHolderName, creditLimit);
        accountsByNumber.put(account.getNumber(), account);
        accountsByHolderName.put(accountHolderName, account);
        return account;
    }

    @Override
    public Account getAccountByHolderName(String accountHolderName) {
        return accountsByHolderName.get(accountHolderName);
    }

    @Override
    public Account getAccountByNumber(String accountNumber) {
        return accountsByNumber.get(accountNumber);
    }

    @Override
    public void closeAccount(Account account) {
        if (account != null) {
            accountsByNumber.remove(account.getNumber());
            accountsByHolderName.remove(account.getHolderName());
        }
    }
}
