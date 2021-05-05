import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class OperationsTest {

    private Calculator calculator;
    private BigDecimal value1;
    private BigDecimal value2;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        value1 = new BigDecimal(9);
        value2 = new BigDecimal(10);
        calculator.setAccumulator(value1);
        calculator.enter();
        calculator.setAccumulator(value2);
    }

    @Test
    public void testExecuteAdd(){
        calculator.execute('+');
        Assertions.assertEquals(new BigDecimal(19), calculator.getAccumulator());
    }

    @Test
    public void testExecuteSubtract(){
        calculator.execute('-');
        Assertions.assertEquals(new BigDecimal(1), calculator.getAccumulator());
    }
}
