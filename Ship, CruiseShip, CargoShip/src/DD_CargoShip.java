/**
 * @author Dolunay Dagci
 * 2/10/19
 * Fixed Code - 02.25.19
 * Assignment: Ch10 Ship, Cruiseship and Cargo Ship
 * CISS 111-360
 * subclass of ship
 */
public class DD_CargoShip extends DD_Ship {

    protected int cargoCapacity;

    /**
     * constructor
     * @param name Ships's name
     * @param year Year Made
     * @param cargoCapacity Cargo Capacity
     */
    DD_CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    /**
     *copy constructor
     * @param ship reference object
     */
    DD_CargoShip(DD_CargoShip ship) {
        super(ship);
    }

    /**
     *
     * @return
     */
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     *
     * @param cargoCapacity
     */
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    /**
     *
     * @return super class's toString and rest of the info of the ship
     */
    @Override
    public String toString() {
        return super.toString() +"\nCargo Capacity: "+ getCargoCapacity();
    }
}
