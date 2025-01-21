
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Give the second number:");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        double difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);

        double product = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);

        double quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

        scanner.close();

    }
}
