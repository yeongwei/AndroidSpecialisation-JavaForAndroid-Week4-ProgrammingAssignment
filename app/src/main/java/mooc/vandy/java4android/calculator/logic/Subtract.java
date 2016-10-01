package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operation {
    @Override
    protected String compute(int argumentOne, int argumentTwo) {
        return String.valueOf(argumentOne - argumentTwo);
    }
}
