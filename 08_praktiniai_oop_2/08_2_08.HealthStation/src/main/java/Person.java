public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    // Constructor to initialize a person with name, age, height, and weight
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Method to print the name and age of the person
    public void printPerson() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
    }

    // Method to increment the age of the person by one year
    public void growOlder() {
        this.age++;
    }

    // Method to check if the person is of legal age (18 or older)
    public boolean isOfLegalAge() {
        return this.age > 17;
    }

    // Setter for height
    public void setHeight(int height) {
        this.height = height;
    }

    // Getter for height
    public int getHeight() {
        return this.height;
    }

    // Getter for weight
    public int getWeight() {
        return this.weight;
    }

    // Setter for weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Method to calculate the BMI (Body Mass Index)
    public double bmi() {
        double heightInMeters = this.height / 100.0;  // Convert height to meters
        return this.weight / (heightInMeters * heightInMeters);  // BMI formula
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Override the toString() method to provide a string representation of the person
    @Override
    public String toString() {
        return "My name is " + this.name + " and I am " + this.age + " years old. My BMI is " + this.bmi();
    }
}
