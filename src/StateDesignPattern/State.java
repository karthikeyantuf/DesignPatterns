package StateDesignPattern;

public interface State {
     void insertCoin(Double amount) throws Exception;
     void pressButton(int asileNumber) throws Exception;
     void dispense(int asileNumber) throws Exception;
}
