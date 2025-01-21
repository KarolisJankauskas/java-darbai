
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here


        System.out.println("Give the first number:");
        int firstNumber = scanner.nextInt(); // Read the first number

        System.out.println("Give the second number:");
        int secondNumber = scanner.nextInt(); // Read the second number

        int result = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + result);


    }
}
