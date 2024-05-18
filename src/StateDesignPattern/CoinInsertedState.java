package StateDesignPattern;

public class CoinInsertedState implements State{

    VendingMachine vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine)
    {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(Double amount) {
        vendingMachine.setAmount(vendingMachine.getAmount() + amount);
    }

    @Override
    public void pressButton(int asileNumber) throws Exception {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProduct(asileNumber);

        if(! vendingMachine.hasSufficientAmount(product.getPrice()))
        {
            throw new Exception("Insufficient amount to buy this product");
        }

        if(! inventory.checkIfProductAvailable(product.productId))
        {
            throw new Exception("Product not available");
        }

        vendingMachine.setCurrentVendingState(vendingMachine.getDispenseState());
    }

    @Override
    public void dispense(int asileNumber) throws  Exception{
        throw new Exception("Product not chosen");
    }
}
