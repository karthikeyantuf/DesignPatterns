package StateDesignPattern;

public class NoCoinInsertedState implements State{
    VendingMachine vendingMachine;

    public NoCoinInsertedState(VendingMachine vendingMachine)
    {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(Double amount) {
        vendingMachine.setAmount(amount);
        vendingMachine.setCurrentVendingState(this.vendingMachine.getCoinInsertedState());
    }

    @Override
    public void pressButton(int asileNumber) throws Exception {
        throw new Exception("Button can not be inserted before inserting Coin");
    }

    @Override
    public void dispense(int asileNumber) throws Exception{
        throw new Exception("Product can not be dispensed before inserting Coin");
    }
}
