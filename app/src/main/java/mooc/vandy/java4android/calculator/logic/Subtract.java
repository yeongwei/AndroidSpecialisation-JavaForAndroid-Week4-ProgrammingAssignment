package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operation {
    @Override
    protected double compute(double argumentOne, double argumentTwo) {
        return argumentOne - argumentTwo;
    }
}
