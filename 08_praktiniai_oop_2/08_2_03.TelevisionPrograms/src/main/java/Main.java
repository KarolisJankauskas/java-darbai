import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Duration:");
        int duration = scanner.nextInt();

        TelevisionProgram televisionProgram = new TelevisionProgram(name, duration);
        programs.add(televisionProgram);


        for (TelevisionProgram program1 : programs) {
            System.out.println(televisionProgram);
        }
    }
}
