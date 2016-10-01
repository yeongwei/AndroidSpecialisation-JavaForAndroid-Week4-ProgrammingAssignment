package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Operation {
    @Override
    protected String compute(int argumentOne, int argumentTwo) {
        return String.valueOf(argumentOne * argumentTwo);
    }
}
