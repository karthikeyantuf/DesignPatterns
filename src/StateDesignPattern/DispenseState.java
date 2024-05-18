package StateDesignPattern;

public class DispenseState implements State{

    VendingMachine vendingMachine;

    public  DispenseState(VendingMachine vendingMachine)
    {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(Double amount) throws Exception{
        throw new Exception("Coin can not be inserted while product dispense");
    }

    @Override
    public void pressButton(int asileNumber) throws Exception{
        throw new Exception("Button can not be pressed while product dispense");
    }

    @Override
    public void dispense(int asileNumber) {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProduct(asileNumber);
        inventory.deductProductCount(asileNumber);
        Double change = vendingMachine.getAmount() - product.getPrice();
        vendingMachine.setAmount(0);
        vendingMachine.setCurrentVendingState(vendingMachine.getNoCoinInsertedState());
        System.out.println("Product id" + product.productId + "Product name" + product.getName() + "And the change ->" +change);
    }
}
