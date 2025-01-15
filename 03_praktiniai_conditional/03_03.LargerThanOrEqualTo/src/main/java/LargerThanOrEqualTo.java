
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int numberFirst = scanner.nextInt();
        System.out.println("Give the second number:");
        int numberSecond = scanner.nextInt();
        if (numberFirst >numberSecond){
            System.out.println("Greater number is:"+numberFirst);
        }
        else if(numberSecond>numberFirst){
            System.out.println("Greater number is:"+numberSecond);
        } else {
            System.out.println("The numbers are equal!");

        }


    }
}
