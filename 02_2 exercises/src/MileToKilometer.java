import java.util.Scanner;

public class MileToKilometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.6;

        System.out.println(miles + " miles is " + kilometers + " kilometers");

        scanner.close();
    }
}
