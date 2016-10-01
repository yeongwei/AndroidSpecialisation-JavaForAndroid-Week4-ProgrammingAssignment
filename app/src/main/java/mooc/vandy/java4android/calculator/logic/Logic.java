package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic
        implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     * Operations
     * 1 - Add
     * 2 - Subtract
     * 3 - Multiply
     * 4 - Divide
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation) {
        try {
            mOut.print(String.valueOf(
                    OperationFactory.create(OperationType.getType(operation))
                            .invoke(argumentOne, argumentTwo)));
        } catch (Exception ex) {
            mOut.print(ex.getMessage());
        }
    }
}
