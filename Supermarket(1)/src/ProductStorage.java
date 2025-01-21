import java.util.Map;
import java.util.TreeMap;

public class ProductStorage {
    private Map<String,Product> products;

    public ProductStorage() {
        products = new TreeMap<>();
        products.put("Milk", new Product("Milk",1.5,10));
        products.put("Apple", new Product("Apple",1,20));
        products.put("Bread", new Product("Bread",1.2,5));

    }

    public Map<String, Product> getProducts() {
        return products;
    }
}
