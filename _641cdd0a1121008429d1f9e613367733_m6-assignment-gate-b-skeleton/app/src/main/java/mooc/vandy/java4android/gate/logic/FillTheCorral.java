package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }


    public void setCorralGates(Gate[] gates, Random rand){
        for (Gate gate : gates) {
            gate.setSwing(rand.nextInt(3) - 1);
        }
    }

    public boolean anyCorralAvailable(Gate[] gates) {
        for (Gate gate : gates) {
            if (gate.getSwingDirection() == Gate.IN) {
                return true;
            }
        }
        return false;
    }

    public int corralSnails(Gate[] gates, Random rand) {
        return 0;
    }
}
