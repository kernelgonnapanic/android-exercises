package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Operation {
   private int mArgumentOne;
   private int mArgumentTwo;
   private int result;

   public Add(int argumentOne, int argumentTwo) {
       mArgumentOne = argumentOne;
       mArgumentTwo = argumentTwo;
   }

   public void calculate() {
       result = mArgumentOne + mArgumentTwo;
   }

   public String toString() {
       return "" + result;
   }
}
