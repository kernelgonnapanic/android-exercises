package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Operation {
    private int mArgumentOne;
    private int mArgumentTwo;
    private int result;
    private int remainder;

    public Divide(int argumentOne, int argumentTwo) {
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }

    public void calculate() {
        result = mArgumentOne / mArgumentTwo;
        remainder = mArgumentOne % mArgumentTwo;
    }

    public String toString() {
        return "" + result + " R: " + remainder;
    }
}
