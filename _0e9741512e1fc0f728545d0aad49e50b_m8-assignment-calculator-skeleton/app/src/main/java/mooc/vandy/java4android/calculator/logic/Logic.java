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
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operationName){

        Operation operation = null;
        switch (operationName) {
            case 1: {
                operation = new Add(argumentOne, argumentTwo);
                break;
            }
            case 2: {
                operation = new Subtract(argumentOne, argumentTwo);
                break;
            }
            case 3: {
                operation = new Multiply(argumentOne, argumentTwo);
                break;
            }
            case 4: {
                operation = new Divide(argumentOne, argumentTwo);
                break;
            }
        }
        operation.calculate();
        mOut.print(operation.toString());
    }
}
