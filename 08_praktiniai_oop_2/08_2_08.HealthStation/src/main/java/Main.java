
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions

        // Create a person
        Person person = new Person("John", 25, 175, 70);

        // Print the person's details
        person.printPerson();

        // Check if the person is of legal age
        System.out.println("Is of legal age: " + person.isOfLegalAge());

        // Print the BMI of the person
        System.out.println("BMI: " + person.bmi());

        // Grow older
        person.growOlder();

        // Print updated person info
        System.out.println(person);
    }
}
