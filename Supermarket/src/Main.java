
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SupermarketServiceImpl supermarket = SupermarketServiceImpl.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSupermarket Menu:");
            System.out.println("1. View Products");
            System.out.println("2. Select Product");
            System.out.println("3. Insert Payment");
            System.out.println("4. Complete Transaction");
            System.out.println("5. Cancel Transaction");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1 -> supermarket.displayProducts();
                    case 2 -> {
                        System.out.print("Enter product name: ");
                        String productName = scanner.nextLine();
                        supermarket.selectProduct(productName);
                    }
                    case 3 -> {
                        System.out.print("Enter payment amount: ");
                        double amount = scanner.nextDouble();
                        supermarket.insertPayment(amount);
                    }
                    case 4 -> supermarket.completeTransaction();
                    case 5 -> supermarket.cancelTransaction();
                    case 6 -> {
                        System.out.println("Exiting Supermarket. Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
