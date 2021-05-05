import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculatorWithThreeValues {

    private Calculator calculator;
    private BigDecimal value1;
    private BigDecimal value2;
    private BigDecimal value3;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        value1 = new BigDecimal(9);
        value2 = new BigDecimal(10);
        value3 = new BigDecimal(11);
        calculator.setAccumulator(value1);
        calculator.enter();
        calculator.setAccumulator(value2);
        calculator.enter();
        calculator.setAccumulator(value3);
    }

    @Test
    void testPushToAccumulator(){
        Assertions.assertEquals(value3, calculator.getAccumulator());
    }

    @Test
    void testPopValueFromAccumulator(){
        calculator.drop();
        Assertions.assertEquals(value2, calculator.getAccumulator());
    }

    @Test
    void testPopValuesFromAccumulator(){
        calculator.drop();
        calculator.drop();
        Assertions.assertEquals(value1, calculator.getAccumulator());
    }

}
