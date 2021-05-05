import java.math.BigDecimal;

public abstract class BinaryOperation implements Operation{

    @Override
    public void applyOperation(OperandStack stack) {
        BigDecimal value1 = stack.peek();
        stack.pop();
        BigDecimal value2 = stack.peek();
        stack.replaceTop(calculate(value1, value2));
    }

    public abstract BigDecimal calculate(BigDecimal value1, BigDecimal value2);

}
