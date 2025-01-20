
import java.util.HashMap;
import java.util.Map;

public class CashRegister {
    private final Map<Double, Integer> cash;

    public CashRegister() {
        cash = new HashMap<>();
        // Initialize with some cash
        cash.put(0.1, 10);
        cash.put(0.5, 10);
        cash.put(1.0, 10);
        cash.put(5.0, 10);
        cash.put(10.0, 10);
    }

    public void addCash(double denomination, int quantity) {
        cash.put(denomination, cash.getOrDefault(denomination, 0) + quantity);
    }

    public Map<Double, Integer> provideChange(double change) throws NotEnoughChangeException {
        Map<Double, Integer> changeToGive = new HashMap<>();
        for (double denomination : cash.keySet().stream().sorted((a, b) -> Double.compare(b, a)).toList()) {
            while (change >= denomination && cash.get(denomination) > 0) {
                change -= denomination;
                change = Math.round(change * 100.0) / 100.0; // Avoid precision errors
                cash.put(denomination, cash.get(denomination) - 1);
                changeToGive.put(denomination, changeToGive.getOrDefault(denomination, 0) + 1);
            }
        }

        if (change > 0) {
            throw new NotEnoughChangeException("Cannot provide the exact change.");
        }
        return changeToGive;
    }
}
