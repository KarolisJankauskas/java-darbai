import java.math.BigDecimal;
import java.util.Collection;

public interface Bank {

    int getNumberOfAccounts();

    BigDecimal getTotalReserves();

    Collection<Account> getAllAccounts();

    Account openDebitAccount(String accountHolderName);

    Account openCreditAccount(String accountHolderName, BigDecimal creditLimit);

    Account getAccountByHolderName(String accountHolderName);

    Account getAccountByNumber(String accountNumber);

    void closeAccount(Account account);
}
