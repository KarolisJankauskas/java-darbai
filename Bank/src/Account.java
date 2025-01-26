import java.math.BigDecimal;

public interface Account {

    String getNumber();

    String getHolderName();

    BigDecimal getBalance();

    boolean deposit(BigDecimal amount);

    boolean withdraw(BigDecimal amount);
}
