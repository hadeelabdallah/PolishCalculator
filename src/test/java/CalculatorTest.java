import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculatorTest {

    @Test
    void testAccumulatorValueIsZero(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(BigDecimal.ZERO,calculator.getAccumulator());
    }


}
