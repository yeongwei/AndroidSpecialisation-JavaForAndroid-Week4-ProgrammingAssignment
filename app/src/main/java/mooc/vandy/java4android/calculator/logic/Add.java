package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Operation {
    @Override
    protected String compute(int argumentOne, int argumentTwo) {
        return String.valueOf(argumentOne + argumentTwo);
    }
}
