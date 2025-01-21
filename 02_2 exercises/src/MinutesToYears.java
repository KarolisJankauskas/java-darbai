import java.util.Scanner;

public class MinutesToYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        long minutes = scanner.nextLong();

        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        scanner.close();
    }
}
