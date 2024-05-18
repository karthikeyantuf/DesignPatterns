package StateDesignPattern;

public class Client {
    public static void main(String args[])
    {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product(1,"Oreo",10.0);
        Product product2 = new Product(2,"Banana",10.0);

        for(int i = 0;i<3;i++)
        {
            vendingMachine.addProduct(product1);
            vendingMachine.addProduct(product2);
        }

        vendingMachine.insertCoin(20.0);
        vendingMachine.pressButton(1);
    }
}
