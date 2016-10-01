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
    public String invoke(int argumentOne, int argumentTwo) {
        if (isValidInput(argumentOne, argumentTwo))
            return compute(argumentOne, argumentTwo);
        else
            throw new RuntimeException("Invalid input arguments");
    }

    abstract protected String compute(int argumentOne, int argumentTwo);

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
