
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = scanner.nextInt();

        int secondsInDay = 86400;
        int totalSeconds = days * secondsInDay;

        System.out.println(totalSeconds);

        // Write your program here

    }
}
