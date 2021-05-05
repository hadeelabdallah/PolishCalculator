import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAccumulatorValueIsZero(){
        Assertions.assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    void testAccumulatorValueIsNotZero(){
        BigDecimal value = new BigDecimal(9);
        calculator.setAccumulator(value);
        Assertions.assertEquals(value,calculator.getAccumulator());
    }

    @Test
    void testPushAndPopValuesFromAccumulator(){
        BigDecimal value1 = new BigDecimal(9);
        BigDecimal value2 = new BigDecimal(10);
        BigDecimal value3 = new BigDecimal(11);
        calculator.setAccumulator(value1);
        calculator.enter();
        calculator.setAccumulator(value2);
        calculator.enter();
        calculator.setAccumulator(value3);
        Assertions.assertEquals(value3, calculator.getAccumulator());
        calculator.drop();
        Assertions.assertEquals(value2, calculator.getAccumulator());
        calculator.drop();
        Assertions.assertEquals(value1, calculator.getAccumulator());
    }
}
