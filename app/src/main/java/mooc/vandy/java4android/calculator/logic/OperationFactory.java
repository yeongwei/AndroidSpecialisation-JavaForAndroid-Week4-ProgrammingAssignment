package mooc.vandy.java4android.calculator.logic;

/**
 * Created by laiyw on 10/1/2016.
 */
public class OperationFactory {
    /**
     * Create the relevant Operation subclass based on Operation Type
     *
     * @param operationType
     * @return
     */
    public static Operation create(OperationType operationType) {
        switch (operationType) {
            case ADD:
                return new Add();
            case SUBTRACT:
                return new Subtract();
            case MULTIPLY:
                return new Multiply();
            case DIVIDE:
                return new Divide();
            default:
                throw new RuntimeException("Invalid operation type.");
        }
    }
}
