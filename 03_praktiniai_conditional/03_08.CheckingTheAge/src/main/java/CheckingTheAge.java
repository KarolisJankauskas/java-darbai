
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age>=121||age<0){
            System.out.println("Imposible!");
        }
        else System.out.println("OK");


    }
}
