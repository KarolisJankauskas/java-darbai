import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private int currentWeight = 0;
    private ArrayList<Item> items = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        if (currentWeight + item.getWeight() <= capacity) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
