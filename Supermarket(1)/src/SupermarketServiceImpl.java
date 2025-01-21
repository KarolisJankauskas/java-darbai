public class SupermarketServiceImpl implements SuperMarketService{

private  ProductStorage productStorage;
private  CashRegister cashRegister;



    public SupermarketServiceImpl() {
        productStorage = new ProductStorage();
        cashRegister = new CashRegister();
    }



}
