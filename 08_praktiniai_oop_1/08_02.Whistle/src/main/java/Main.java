
public class Main {

    public static void main(String[] args) {
        // This is just an empty main method you can use to test
        // the Whistle class. Try for example:

//        Whistle duckWhistle = new Whistle("Kvaak");
//        Whistle roosterWhistle = new Whistle("Peef");
//
//        duckWhistle.sound();
//        roosterWhistle.sound();
//        duckWhistle.sound();
        // Create new Whistle objects with different sounds
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        // Call the sound() method on the Whistle objects
        duckWhistle.sound();   // Prints: Kvaak
        roosterWhistle.sound(); // Prints: Peef
        duckWhistle.sound();   // Prints: Kvaak

    }
}
