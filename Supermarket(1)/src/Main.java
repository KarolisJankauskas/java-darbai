import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to TECHIN Supermarket");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSupermarket Menu:");
        System.out.println("1. View available products:");
        System.out.println("2. Select a product");
        System.out.println("3. Insert payment");
        System.out.println("4. Complete Transaction");
        System.out.println("5. Cancel the transaction");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
    }
}