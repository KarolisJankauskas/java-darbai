public class AdvancedAstrology {

    // Method to print the given number of stars
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    // Method to print the given number of spaces
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    // Method to print a right-leaning triangle of stars with the given size
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            // Print (size - i) spaces first, followed by i stars
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
    }

    // Method to print a Christmas tree with the specified height
    public static void christmasTree(int height) {
        // Print the triangle portion
        for (int i = 1; i <= height; i++) {
            // Print (height - i) spaces followed by (2 * i - 1) stars for each layer of the tree
            printSpaces(height - i);
            printStars(2 * i - 1);
            System.out.println();
        }

        // Print the base of the tree
        printSpaces(height - 2); // Center the base
        printStars(3);            // Print the base stars
        System.out.println();
        printSpaces(height - 2); // Center the base again
        printStars(3);            // Print the base stars again
        System.out.println();
    }

    public static void main(String[] args) {
        // Test the methods with sample inputs
        printTriangle(5);   // Expected output: right-leaning triangle of height 5
        System.out.println("---");
        christmasTree(4);   // Expected output: Christmas tree of height 4
    }
}
