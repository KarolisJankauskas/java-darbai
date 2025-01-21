package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        // Write your program here
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;


        int reversed = ones * 100 + tens * 10 + hundreds;

        System.out.println(reversed);
    }
}
