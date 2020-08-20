/**
 * @author Dolunay Dagci
 * 2/10/19
 * Fixed Code -02.25.19
 * Assignment: Ch10 Ship, Cruiseship and Cargo Ship
 * CISS 111-360
 * subclass of Ship
 * superclass of RiverCruise and OceanCruise ships
 */
public class DD_CruiseShip extends DD_Ship {
    protected int maxPassenger;
    protected int minPassenger;

    /**
     * constructor
    *@param name Ship's name
     *@param year  Year Made
     *@param maxPassenger Maximum number of passengers
     *@param minPassenger Minimum number of passengers
     */
    DD_CruiseShip(String name, String year, int maxPassenger, int minPassenger) {
        super(name, year);
        this.maxPassenger = maxPassenger;
        this.minPassenger = minPassenger;
    }

    /**
     *copy constructor
     * @param ship Refernce object
     */
    DD_CruiseShip(DD_CruiseShip ship) {
        super(ship);
    }

    /**
     *
     * @return max # of Passengers
     */
    public int getMaxPassenger() {
        return maxPassenger;
    }

    /**
     *
     * @param maxPassenger
     */
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    /**
     *
     * @return
     */
    public int getMinPassenger() {
        return minPassenger;
    }

    /**
     *
     * @param minPassenger min # of Passengers
     */
    public void setMinPassenger(int minPassenger) {
        this.minPassenger = minPassenger;
    }

    /**
     * @return super class's toString and rest of the info of the ship
     */
    @Override
    public String toString() {
        return super.toString() +"\nMaximum Number Of Passengers: "+ (getMaxPassenger() + "\nMinimum Number Of Passengers: " + getMinPassenger());
    }
}

