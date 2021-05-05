import java.math.BigDecimal;
import java.util.Stack;

public class Calculator {
    private Stack<BigDecimal> stack = new Stack();

    public BigDecimal getAccumulator() {
        return stack.size() != 0 ? stack.peek() : BigDecimal.ZERO;
    }

    public void setAccumulator(BigDecimal bigDecimal) {
        if(stack.size() > 0){
            stack.pop();
        }
        stack.push(bigDecimal);
    }

    public void enter() {
        stack.push(getAccumulator());
    }

    public void drop() {
        stack.pop();
    }
}
