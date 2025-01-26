import java.math.BigDecimal;
import java.util.UUID;

public class DebitAccount implements Account {
    private final String number;
    private final String holderName;
    private BigDecimal balance;

    public DebitAccount(String holderName) {
        this.number = UUID.randomUUID().toString();
        this.holderName = holderName;
        this.balance = BigDecimal.ZERO;
    }

    @Override
    public String getNumber() {
        return number;
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
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            return true;
        }
        return false;
    }
}
