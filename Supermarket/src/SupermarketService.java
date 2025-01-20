



public interface SupermarketService {
    void displayProducts();

    void selectProduct(String productName) throws SoldOutException;

    void insertPayment(double amount) throws PayNotAcceptedException, NotEnoughChangeException;

    void completeTransaction();

    void cancelTransaction();
}
