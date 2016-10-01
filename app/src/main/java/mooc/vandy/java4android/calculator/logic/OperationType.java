package mooc.vandy.java4android.calculator.logic;

/**
 * Manage operation constants
 * refer to res/values/strings.xml and MainActivity#getOperationNumber
 * for details
 */
public enum OperationType {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    /**
     * Get OperationType based on integer from UI
     *
     * @param id
     * @return
     */
    public static OperationType getType(int id) {
        switch (id) {
            case 1:
                return ADD;
            case 2:
                return SUBTRACT;
            case 3:
                return MULTIPLY;
            case 4:
                return DIVIDE;
            default:
                throw new RuntimeException("Invalid operation type.");
        }
    }
}
