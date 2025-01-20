

import java.util.HashMap;
import java.util.Map;

public class ProductStorage {
    private final Map<String, Product> products;

    public ProductStorage() {
        products = new HashMap<>();
        // Initialize with sample products
        products.put("Milk", new Product("Milk", 1.5, 5));
        products.put("Bread", new Product("Bread", 2.0, 10));
        products.put("Eggs", new Product("Eggs", 3.0, 8));
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public Product getProduct(String name) throws SoldOutException {
        if (!products.containsKey(name) || !products.get(name).isAvailable()) {
            throw new SoldOutException("Product is out of stock.");
        }
        return products.get(name);
    }

    public void updateStock(String name) throws SoldOutException {
        Product product = getProduct(name);
        product.decreaseStock();
    }
}
