
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Give the second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Give the third number:");
//      int thirdNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = scanner.nextInt();


        int sum = firstNumber + secondNumber + thirdNumber;

        System.out.println("The sum of the numbers is " + sum);

    }
}
