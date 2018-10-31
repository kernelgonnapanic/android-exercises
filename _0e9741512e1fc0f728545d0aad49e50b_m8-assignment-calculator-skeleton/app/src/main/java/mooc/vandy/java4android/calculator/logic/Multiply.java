package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Operation {
    private int mArgumentOne;
    private int mArgumentTwo;
    private int result;

    public Multiply(int argumentOne, int argumentTwo) {
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }
    public void calculate() {
        result = mArgumentOne * mArgumentTwo;
    }

    public String toString() {
        return "" + result;
    }
}
