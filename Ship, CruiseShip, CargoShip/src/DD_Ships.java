
/**
 * @author Dolunay Dagci
 * 2/10/19
 * Fixed Code - 02.25.19
 * Assignment: Ch10 Ship, Cruiseship and Cargo Ship
 * CISS 111-360
 * This program stores data of ships and steps through array of ships.
 * main class
 */
public class DD_Ships {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        DD_Ship[] ships = new DD_Ship[4];
        ships[0] = new DD_CruiseShip("Cruise Ship", "1970", 600, 200);

        ships[1] = new DD_CargoShip("Cargo Ship", "2008", 500 );

        ships[2] = new DD_RiverCruiseShip("River Cruise Ship", "2000", 400, 100);

        ships[3] = new DD_OceanCruiseShip("Ocean Cruise Ship", "2015", 6000, 1000);

        for (int i = 0; i < ships.length; i++) {
            System.out.println(ships[i]);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
