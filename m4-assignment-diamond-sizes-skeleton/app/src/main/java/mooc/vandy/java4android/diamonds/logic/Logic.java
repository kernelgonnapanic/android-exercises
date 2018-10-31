package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is that draws top and bottom border of given size
     */
    private void drawBorder(int size) {
        mOut.print("+");
        for (int i = 0; i < 2 * size; i++) {
            mOut.print("-");
        }
        mOut.println("+");
    }

    private char chooseSymbol(int depth) {
        char symbol;
        if (depth % 2 == 0) {
            symbol = '-';
        } else {
            symbol = '=';
        }
        return symbol;
    }

    private void drawRow(int size, int depth) {
        char symbol = chooseSymbol(depth);
        mOut.print("|");
        for (int i = 0; i < size; i++) {
            if (depth == size && i == 0) {
                mOut.print('<');
            } else if (i == size - depth){
                mOut.print('/');
            } else if (i == -(size - depth)){
                mOut.print('\\');
            } else if (i < Math.abs(size - depth)) {
                mOut.print(' ');
            } else {
                mOut.print(symbol);
            }
        }
        for (int i = size-1; i >= 0; i--) {
            if (depth == size && i == 0) {
                mOut.print('>');
            } else if (i == size - depth){
                mOut.print('\\');
            } else if (i == -(size - depth)) {
                mOut.print('/');
            } else if (i < Math.abs(size - depth)) {
                mOut.print(' ');
            } else {
                mOut.print(symbol);
            }
        }
        mOut.println("|");
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        this.drawBorder(size);
        for (int i = 1; i < 2 * size; i++) {
            drawRow(size, i);
        }
        this.drawBorder(size);
    }

}
