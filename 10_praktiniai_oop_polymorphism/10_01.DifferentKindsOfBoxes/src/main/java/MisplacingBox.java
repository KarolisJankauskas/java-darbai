import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public void add(Item item) {
        items.add(item);  // Items can always be added
    }

    @Override
    public boolean isInBox(Item item) {
        return false;  // Always return false when looking for an item
    }
}
