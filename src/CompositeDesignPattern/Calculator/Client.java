package CompositeDesignPattern.Calculator;

public class Client {
    public static void main(String args[])
    {
        Number one = new Number(1);
        Number two = new Number(2);
        Number seven = new Number(7);

        Expression expressionAdd = new Expression(one,two,Operation.ADD);
        Expression expressionMultiply = new Expression(seven,expressionAdd,Operation.MULTIPLY);

        System.out.println(expressionMultiply.evaluate());

    }
}
