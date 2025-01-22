import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("Owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));

        VehicleRegistry registry = new VehicleRegistry();
        registry.add(li1, "Arto");
        registry.add(li2, "Pekka");
        registry.add(li3, "Jürgen");

        System.out.println("--- License Plates ---");
        registry.printLicensePlates();

        System.out.println("--- Owners ---");
        registry.printOwners();

        System.out.println("Owner of " + li1 + ": " + registry.get(li1));
        registry.remove(li2);
        System.out.println("--- After removing FI UXE-465 ---");
        registry.printLicensePlates();
    }
}

//Equals and hashCode for the LicensePlate class
//European license plates have two parts: a two letter country code and a nationally unique license number. The license number is made up of numbers and characters.

//We want to be able to save the license plates in ArrayLists and to use them as keys in a HashMap. This, as explained above, means that
//the equals and hashcode methods need to be overwritten, or they won't work as intended.

//Pairing plates with owners
//Implement the class VehicleRegistry, which has the following methods:
//public boolean add(LicensePlate licensePlate, String owner) assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter. If the license plate doesn't have an owner, the method returns true. If the license already has an owner attached, the method returns false and does nothing.
//public String get(LicensePlate licensePlate) returns the owner of the car corresponding to the license plate received as a parameter. If the car isn't in the registry, the method returns null. public boolean remove(LicensePlate licensePlate) removes the license plate and attached data from the registry. The method returns true if removed successfully and false if the license plate wasn't in the registry.
//Expanded vehicle registry
//Add the following methods to the VehicleRegistry:
//public void printLicensePlates()prints the license plates in the registry.
//public void printOwners() prints the owners of the cars in the registry. Each name should only be printed once, even if a particular person owns more than one car.
//Useful tip! In the printOwners method, you can create a list used for remembering the owners that were already printed. If an owner is not on the list, their name is printed and they are added to the list; conversely, if an owner is on the list, their name isn't printed.
