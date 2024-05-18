package StateDesignPattern;

public class VendingMachine {
    private NoCoinInsertedState noCoinInsertedState;
    private CoinInsertedState coinInsertedState;
    private DispenseState dispenseState;
    private State currentVendingState;
    private Inventory inventory;

    private double amount;
    private static final int asileCount = 2 ;



    public VendingMachine()
    {
        noCoinInsertedState = new NoCoinInsertedState(this);
        coinInsertedState = new CoinInsertedState(this);
        dispenseState = new DispenseState(this);
        currentVendingState = noCoinInsertedState;
        inventory = new Inventory(asileCount);
        amount = 0.0;
    }

    public NoCoinInsertedState getNoCoinInsertedState() {
        return noCoinInsertedState;
    }

    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public State getCurrentVendingState() {
        return currentVendingState;
    }

    public void setCurrentVendingState(State currentVendingState) {
        this.currentVendingState = currentVendingState;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Boolean hasSufficientAmount(Double amount)
    {
        return amount <= this.getAmount();
    }
    public void insertCoin(Double amount)
    {
        try {
            this.currentVendingState.insertCoin(amount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void pressButton(int asileNumber)
    {
        try {
            this.currentVendingState.pressButton(asileNumber);
            this.currentVendingState.dispense(asileNumber);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void addProduct(Product product)
    {
        try {
            this.getInventory().addProduct(product);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
