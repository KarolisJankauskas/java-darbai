
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        boolean first = true;

        for (int number : array) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(number);
            first = false;
        }

        System.out.println();
    }

}
