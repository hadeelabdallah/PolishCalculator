import java.math.BigDecimal;
import java.util.Stack;

public class OperandStack {

    private Stack<BigDecimal> stack = new Stack<>();

    public BigDecimal peek() {
        if(stack.size() == 0){
            return BigDecimal.ZERO;
        }
        return stack.peek();
    }

    public void push(BigDecimal value) {
        stack.push(value);
    }

    public void replaceTop(BigDecimal value2) {
        if(stack.size() > 0) {
            stack.pop();
        }
        stack.push(value2);
    }

    public void pop() {
        if(stack.size() != 0) {
            stack.pop();
        }
    }
}
