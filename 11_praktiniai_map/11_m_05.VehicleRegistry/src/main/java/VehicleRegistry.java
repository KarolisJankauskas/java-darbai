import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    private final HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public void remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            return;
        }
        registry.remove(licensePlate);
    }

    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        HashSet<String> printedOwners = new HashSet<>();
        for (String owner : registry.values()) {
            if (!printedOwners.contains(owner)) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}
