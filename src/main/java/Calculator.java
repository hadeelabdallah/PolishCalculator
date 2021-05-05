import java.math.BigDecimal;

public class Calculator {
    private OperandStack stack = new OperandStack();

    public BigDecimal getAccumulator() {
        return stack.peek();
    }

    public void setAccumulator(BigDecimal bigDecimal) {
        stack.replaceTop(bigDecimal);
    }

    public void enter() {
        stack.push(getAccumulator());
    }

    public void drop() {
        stack.pop();
    }

    public void execute(char op) {
        switch (op){
            case '+': new AddOperation().applyOperation(stack);
            break;
            case '-': new SubtractOperation().applyOperation(stack);
            break;
        }
    }
}
