import java.util.HashMap;
import java.util.Map;

public class CashRegister {
    private final Map<Double, Integer> cash;

    public CashRegister() {
        cash = new HashMap<>();

        cash.put(0.1, 12);
        cash.put(0.5, 15);
        cash.put(1.0, 10);
        cash.put(5.0, 10);
        cash.put(10.0, 10);
    }

    public void addCash(double denomination, int quantity) {
        cash.put(denomination, cash.getOrDefault(denomination, 0) + quantity);
    }
}

