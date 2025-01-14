public class Whistle {

    // Private variable to store the sound of the whistle
    private String sound;

    // Constructor to initialize the sound of the whistle
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    // Method to print the sound of the whistle
    public void sound() {
        System.out.println(this.sound);
    }
}
