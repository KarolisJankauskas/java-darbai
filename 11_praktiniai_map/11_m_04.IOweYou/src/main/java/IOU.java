import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debts;

    public IOU() {
        debts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur")); // 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael")); // 30.0

        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur")); // 10.5

        System.out.println(mattsIOU.howMuchDoIOweTo("John")); // 0.0
    }
}
//Create a class called IOU which has the following methods:
//constructor public IOU() creates a new IOU
//public void setSum(String toWhom, double amount) saves the amount owed and the person owed to to the IOU.
//public double howMuchDoIOweTo(String toWhom) returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.

