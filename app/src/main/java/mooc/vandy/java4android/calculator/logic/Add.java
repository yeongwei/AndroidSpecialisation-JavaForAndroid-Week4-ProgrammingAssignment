package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Operation {
    @Override
    protected double compute(double argumentOne, double argumentTwo) {
        return argumentOne + argumentTwo;
    }
}
