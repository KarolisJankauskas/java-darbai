

import java.util.Scanner;

public class SupermarketServiceImpl implements SupermarketService {
    private static SupermarketServiceImpl instance;
    private final ProductStorage productStorage;
    private final CashRegister cashRegister;
    private Product selectedProduct;
    private double totalPaid;

    private SupermarketServiceImpl() {
        productStorage = new ProductStorage();
        cashRegister = new CashRegister();
        totalPaid = 0.0;
    }

    public static SupermarketServiceImpl getInstance() {
        if (instance == null) {
            instance = new SupermarketServiceImpl();
        }
        return instance;
    }

    @Override
    public void displayProducts() {
        System.out.println("Available products:");
        for (Product product : productStorage.getProducts().values()) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " (Stock: " + product.getStock() + ")");
        }
    }

    @Override
    public void selectProduct(String productName) throws SoldOutException {
        selectedProduct = productStorage.getProduct(productName);
        System.out.println("You selected: " + selectedProduct.getName() + " - $" + selectedProduct.getPrice());
    }

    @Override
    public void insertPayment(double amount) throws PayNotAcceptedException, NotEnoughChangeException {
        if (amount <= 0 || (!cashRegister.provideChange(amount).isEmpty() && !cashRegister.provideChange(0).isEmpty())) {
            throw new PayNotAcceptedException("Invalid payment.");
        }
        totalPaid += amount;
        System.out.println("Total paid: $" + totalPaid);
    }

    @Override
    public void completeTransaction() {
        if (totalPaid >= selectedProduct.getPrice()) {
            double change = totalPaid - selectedProduct.getPrice();
            try {
                cashRegister.provideChange(change);
                System.out.println("Transaction successful! Dispensing " + selectedProduct.getName() + ".");
                productStorage.updateStock(selectedProduct.getName());
                System.out.println("Change returned: $" + change);
                totalPaid = 0.0;
                selectedProduct = null;
            } catch (NotEnoughChangeException | SoldOutException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Insufficient payment. Add $" + (selectedProduct.getPrice() - totalPaid) + " more.");
        }
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Transaction canceled. Returning payment: $" + totalPaid);
        totalPaid = 0.0;
        selectedProduct = null;
    }
}
