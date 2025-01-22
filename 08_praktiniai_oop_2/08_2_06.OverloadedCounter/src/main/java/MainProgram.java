
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here


        Counter counter1 = new Counter(10);
        System.out.println("Initial value (counter1): " + counter1.value()); // 10

        counter1.increase();
        System.out.println("After increase (counter1): " + counter1.value()); // 11

        counter1.decrease();
        System.out.println("After decrease (counter1): " + counter1.value()); // 10

        counter1.increase(5);
        System.out.println("After increase by 5 (counter1): " + counter1.value()); // 15

        counter1.decrease(3);
        System.out.println("After decrease by 3 (counter1): " + counter1.value()); // 12

        Counter counter2 = new Counter();
        System.out.println("Initial value (counter2): " + counter2.value()); // 0

        counter2.increase();
        System.out.println("After increase (counter2): " + counter2.value()); // 1

        counter2.decrease(2);
        System.out.println("After decrease by 2 (counter2): " + counter2.value()); // -1
    }
    }

