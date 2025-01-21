
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String name = scanner.nextLine();

        System.out.println("Give an integer: ");
        int number = scanner.nextInt();

        System.out.println("Give a double: ");
        double number1 = scanner.nextDouble();

        System.out.println("Give a boolean: ");
        boolean boolean1 = scanner.nextBoolean();

        System.out.println("You gave the string " + name);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + number1);
        System.out.println("You gave the boolean " + boolean1);

    }
}
