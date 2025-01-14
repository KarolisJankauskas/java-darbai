public class OneItemBox extends Box{


    private Item item;

    @Override
    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        }

    }

    public OneItemBox() {
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item != null && this.item.equals(item);
    }
}
