package mooc.vandy.java4android.calculator.logic;

/**
 * Created by laiyw on 10/1/2016.
 */
abstract class Operation {
    /**
     * Single entry available to callee for invocation
     *
     * @param argumentOne
     * @param argumentTwo
     * @return
     */
    public double invoke(int argumentOne, int argumentTwo) {
        if (isValidInput(argumentOne, argumentTwo))
            return compute(argumentOne, argumentTwo);
        else
            throw new RuntimeException("Invalid input arguments");
    }

    /**
     * Cast all incoming integer into double
     *
     * @param argumentOne
     * @param argumentTwo
     * @return
     */
    private double compute(int argumentOne, int argumentTwo) {
        return compute((double) argumentOne, (double) argumentTwo);
    }

    abstract protected double compute(double argumentOne, double argumentTwo);

    /**
     * Check if inputs are valid
     *
     * @param argumentOne
     * @param argumentTwo
     * @return
     */
    protected boolean isValidInput(int argumentOne, int argumentTwo) {
        return true;
    }
}
