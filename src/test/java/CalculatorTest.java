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
}
