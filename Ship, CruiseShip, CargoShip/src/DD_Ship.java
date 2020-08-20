/**
 * @author Dolunay Dagci
 * 2/10/19
 * Fixed Code - 02.25.19
 * Assignment: Ch10 Ship, Cruiseship and Cargo Ship
 * CISS 111-360
 * super class
 */
public class DD_Ship {

    protected String ShipName;
    protected String yearMade;

    /**
     * Constructor
     * @param name Ship's name
     * @param year Year made
     */
    DD_Ship(String name,String year) {
        ShipName = name;
        yearMade = year;
    }

    /**
     * Copy Constructor
     * @param ship Ship object
     */
    DD_Ship(DD_Ship ship) {
        ShipName = ship.ShipName;
        yearMade = ship.yearMade;
    }

    /**
     *
     * @return ShipName
     */
    public String getShipName() {
        return ShipName;
    }

    /**
     *
     * @param shipName
     */
    public void setShipName(String shipName) {
        ShipName = shipName;
    }

    /**
     *
     * @return yearMade
     */
    public String getYearMade() {
        return yearMade;
    }

    /**
     *
     * @param yearMade
     */
    public void setYearMade(String yearMade) {
        this.yearMade = yearMade;
    }

    /**
     *
     * @return info of Ship
     */
    @Override
    public String toString() {
        return "Ship Name: " + getShipName() +"\nYear Made: "+ getYearMade();
    }
}