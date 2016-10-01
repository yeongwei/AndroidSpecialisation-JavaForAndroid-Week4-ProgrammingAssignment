package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Operation {
    @Override
    protected String compute(int argumentOne, int argumentTwo) {
        return String.valueOf(argumentOne / argumentTwo)
                + " R: "
                + String.valueOf(argumentOne % argumentTwo);
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
