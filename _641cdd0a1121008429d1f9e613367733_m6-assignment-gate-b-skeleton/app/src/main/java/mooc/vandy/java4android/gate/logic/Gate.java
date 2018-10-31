package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    public Gate() {
        mSwing = CLOSED;
    }

    public int getSwingDirection() {
        return mSwing;
    }

    public boolean setSwing(int direction) {
        if( direction == IN || direction == OUT || direction == CLOSED) {
            mSwing = direction;
            return true;
        }
        return false;
    }

    public boolean open(int direction) {
        if( direction == IN || direction == OUT) {
            setSwing(direction);
            return true;
        }
        return false;
    }

    public int thru(int count) {
        return count * mSwing;
    }

    public boolean close() {
        mSwing = CLOSED;
        return true;
    }

    public String toString() {
        if (mSwing == CLOSED) {
            return "This gate is closed";
        }
        if (mSwing == IN) {
            return "This gate is open and swings to enter the pen only";
        }
        if (mSwing == OUT) {
            return "This gate is open and swings to exit the pen only";
        }
        return "This gate has an invalid swing direction";
    }
}
