import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class OperandStackTest {

    private OperandStack stack;

    @BeforeEach
    void setUp() {
        stack = new OperandStack();
    }

    @Test
    public void testAccumulatorValueIsZeroWhenEmpty(){
        Assertions.assertEquals(BigDecimal.ZERO, stack.peek());
    }

    @Test
    public void testPushingNewValuesToStack(){
        BigDecimal value = new BigDecimal(1);
        stack.push(value);
        Assertions.assertEquals(value, stack.peek());
    }

    @Test
    public void replacingTopOfTheStack(){
        stack.push(new BigDecimal(1));
        BigDecimal value2 = new BigDecimal(2);
        stack.replaceTop(value2);
        Assertions.assertEquals(value2, stack.peek());
    }

    @Test
    public void replacingTopWithEmptyStack(){
        BigDecimal value2 = new BigDecimal(2);
        stack.replaceTop(value2);
        Assertions.assertEquals(value2, stack.peek());
    }

    @Test
    public void testPoppingValuesFromStack(){
        BigDecimal value1 = new BigDecimal(1);
        stack.push(value1);
        BigDecimal value2 = new BigDecimal(2);
        stack.push(value2);
        stack.pop();
        Assertions.assertEquals(value1, stack.peek());
    }

    @Test
    public void testPoppingValuesFromEmptyStack(){
        stack.pop();
        Assertions.assertEquals(BigDecimal.ZERO, stack.peek());
    }
}
