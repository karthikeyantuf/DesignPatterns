package CompositeDesignPattern.Calculator;

public class Expression implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    Expression(ArithmeticExpression leftExpression , ArithmeticExpression rightExpression , Operation operation)
    {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    public int evaluate()
    {
        int ans = 0;
        switch (operation)
        {
            case ADD:
            {
                ans = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            }
            case SUBTRACT:
            {
                ans = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            }
            case MULTIPLY:
            {
                ans = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            }
            case DIVIDE:
            {
                ans = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            }
            default:
            {
                System.out.print("Unsupported operation");
            }
        }
        return ans;
    }

}
