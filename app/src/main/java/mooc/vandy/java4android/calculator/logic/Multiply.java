package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Operation {
    @Override
    protected double compute(double argumentOne, double argumentTwo) {
        return argumentOne * argumentTwo;
    }
}
