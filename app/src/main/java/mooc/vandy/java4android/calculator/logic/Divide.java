package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Operation {
    @Override
    protected double compute(double argumentOne, double argumentTwo) {
        return argumentOne / argumentTwo;
    }

    /**
     * Avoid division by zero
     *
     * @param argumentOne
     * @param argumentTwo
     * @return
     */
    @Override
    protected boolean isValidInput(int argumentOne, int argumentTwo) {
        if (argumentTwo == 0)
            throw new RuntimeException("Value Two cannot be zero.");
        return true;
    }
}
