package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {

    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        mParkingSpaces = 0;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName,
                  int parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces = parkingSpaces;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setBusinessName(String businessName) {
        mBusinessName = businessName;
    }

    public void setParkingSpaces(int parkingSpaces) {
        mParkingSpaces = parkingSpaces;
    }

    public String toString() {
        return "Business: " +
                (getBusinessName() != null ? getBusinessName() : "unoccupied") +
                (mParkingSpaces > 0 ? "; has " + mParkingSpaces+ " parking spaces" : "") +
                " (total offices: " + sTotalOffices + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof Office) {
            return (((Office) object).calcBuildingArea() == calcBuildingArea() && mParkingSpaces == ((Office) object).mParkingSpaces);
        }
        return false;
    }
}
