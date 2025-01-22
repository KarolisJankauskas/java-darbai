public class HealthStation {

    // Counter for the number of weighings performed
    private int weighCount = 0;

    // Method to weigh a person, returns the weight of the person
    public int weigh(Person person) {
        weighCount++;  // Increment the number of weighings
        return person.getWeight();
    }

    // Method to feed a person, increases their weight by 1
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    // Method to get the number of weighings performed
    public int weighings() {
        return weighCount;
    }
}