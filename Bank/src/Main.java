import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new SimpleBank();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to iBank!");
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Open Debit Account");
            System.out.println("2. Open Credit Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Account Details");
            System.out.println("6. View Total Reserves");
            System.out.println("7. Close Account");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> openDebitAccount(bank, scanner);
                case 2 -> openCreditAccount(bank, scanner);
                case 3 -> depositMoney(bank, scanner);
                case 4 -> withdrawMoney(bank, scanner);
                case 5 -> viewAccountDetails(bank, scanner);
                case 6 -> viewTotalReserves(bank);
                case 7 -> closeAccount(bank, scanner);
                case 8 -> {
                    running = false;
                    System.out.println("Thank you for using iBank. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void openDebitAccount(Bank bank, Scanner scanner) {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        Account account = bank.openDebitAccount(name);
        if (account != null) {
            System.out.println("Debit account created successfully! Account Number: " + account.getNumber());
        } else {
            System.out.println("Failed to create debit account. An account may already exist for this user.");
        }
    }

    private static void openCreditAccount(Bank bank, Scanner scanner) {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter credit limit: ");
        BigDecimal creditLimit = scanner.nextBigDecimal();
        scanner.nextLine(); // consume newline

        Account account = bank.openCreditAccount(name, creditLimit);
        if (account != null) {
            System.out.println("Credit account created successfully! Account Number: " + account.getNumber());
        } else {
            System.out.println("Failed to create credit account. An account may already exist for this user.");
        }
    }

    private static void depositMoney(Bank bank, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.getAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter amount to deposit: ");
        BigDecimal amount = scanner.nextBigDecimal();
        scanner.nextLine(); // consume newline
        if (account.deposit(amount)) {
            System.out.println("Deposit successful! New balance: " + account.getBalance());
        } else {
            System.out.println("Deposit failed. Please enter a valid amount.");
        }
    }

    private static void withdrawMoney(Bank bank, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.getAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        BigDecimal amount = scanner.nextBigDecimal();
        scanner.nextLine(); // consume newline
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful! New balance: " + account.getBalance());
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        }
    }

    private static void viewAccountDetails(Bank bank, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.getAccountByNumber(accountNumber);
        if (account != null) {
            System.out.println("Account Details:");
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Account Number: " + account.getNumber());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void viewTotalReserves(Bank bank) {
        System.out.println("Total Bank Reserves: " + bank.getTotalReserves());
    }

    private static void closeAccount(Bank bank, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.getAccountByNumber(accountNumber);
        if (account != null) {
            bank.closeAccount(account);
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }
}
