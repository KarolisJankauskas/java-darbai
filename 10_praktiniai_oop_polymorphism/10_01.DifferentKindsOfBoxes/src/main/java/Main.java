

public class Main {

    public static void main(String[] args) {

        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo",5)));  // true
        System.out.println(coffeeBox.isInBox(new Item("Pirkka",5)));  // true
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak",5)));  // false

        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo",5)));  // true
        System.out.println(box.isInBox(new Item("Pirkka",5)));  // false

        MisplacingBox box1 = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo",5)));  // false
        System.out.println(box.isInBox(new Item("Pirkka",5)));  // false





        // You can test your program here
    }
}
