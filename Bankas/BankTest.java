import ibank.Bank;
import ibank.BankImpl;
import ibank.BaseBankTest;

public class BankTest extends BaseBankTest {
    @Override
    protected Bank createBank() {
        return new BankImpl();
    }

}
