/**
 * @author Dolunay Dagci
 * 2/10/19
 * Fixed Code - 02.25.19
 * Assignment: Ch10 Ship, Cruiseship and Cargo Ship
 * CISS 111-360
 * subclass CruiseShip
 */
public class DD_OceanCruiseShip extends DD_CruiseShip {

    /**
     *constructor
     *@param name Ship's name
     * @param year  Year Made
     * @param maxPassenger Maximum number of passengers
     * @param minPassenger Minimum number of passengers
     */
    DD_OceanCruiseShip(String name, String year, int maxPassenger, int minPassenger) {
        super(name, year, maxPassenger, minPassenger);
    }

    /**
     * copy constructor
     * @param ship Reference object
     */
    DD_OceanCruiseShip(DD_CruiseShip ship) {
        super(ship);
    }


    /**
     *
     *super class's toString
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
