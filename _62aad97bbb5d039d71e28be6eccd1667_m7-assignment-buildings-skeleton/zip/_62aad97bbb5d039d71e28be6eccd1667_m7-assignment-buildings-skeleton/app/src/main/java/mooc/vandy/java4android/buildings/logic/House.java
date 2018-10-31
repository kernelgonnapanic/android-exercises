package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        mOwner = null;
        mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        mOwner = owner;
        mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        this(length, width, lotLength, lotWidth, owner);
        mPool = pool;
    }



    public String getOwner() {
        return mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public void setPool(boolean pool) {
        mPool = pool;
    }

    public String toString() {
        return "Owner: " + mOwner + (mPool ? "; has a pool" : "") + (calcLotArea() > calcBuildingArea() ?  "; has a big open space" : "");
    }

    public boolean equals(Object object) {
        if (object instanceof House ) {
            if (((House) object).hasPool() == hasPool() && ((House) object).calcBuildingArea() == calcBuildingArea()) {
                return true;
            }
        }
        return false;
    }
}
