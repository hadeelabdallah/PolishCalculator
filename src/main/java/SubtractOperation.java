import java.math.BigDecimal;

public class SubtractOperation extends BinaryOperation{

    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value1.subtract(value2);
    }
}
