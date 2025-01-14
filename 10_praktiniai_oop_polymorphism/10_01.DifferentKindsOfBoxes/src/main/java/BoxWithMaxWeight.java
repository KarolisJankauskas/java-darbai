import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box{

    private int maxWeight;

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private List<Item> items;



    @Override
    public void add(Item item) {

        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        items.add(item);

    }

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
