
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter identification number: ");
            String identificationNumber = scanner.nextLine();

            PersonalInformation person = new PersonalInformation(firstName, lastName, identificationNumber);
            infoCollection.add(person);



        for (PersonalInformation person1 : infoCollection) {
            System.out.println(person);
        }






    }
}
