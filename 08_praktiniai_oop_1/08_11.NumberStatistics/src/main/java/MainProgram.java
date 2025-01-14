
import java.util.Scanner;

public class MainProgram {

    public static void main(String... args) {
        int sum;
        try (Scanner scanner = new Scanner(System.in)) {
            sum = 0;

            System.out.println("Enter numbers:");

            while (true) {
                int number = scanner.nextInt();
                if (number < 0) break;
                sum = sum + number;
            }
        }

        System.out.println("Sum: " + sum);

        Statistics statistics = new Statistics(4);
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: "+statistics.getCount());
        System.out.println("Sum: "+statistics.sum());
        System.out.println("Average: "+statistics.average());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
