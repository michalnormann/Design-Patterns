package factory.firstFactoryExample;

import static factory.firstFactoryExample.ShipType.CARGOSHIPWITHADDICTIONALSIZE;
import static factory.firstFactoryExample.ShipType.CARGO_SHIP;

public class Main {

//    https://javadeveloper.pl/wzorzec-projektowy-fabryka/
    public static void main(String[] args) {

        Ship cargoShip = ShipFactory.createShip(CARGO_SHIP);
        System.out.println(cargoShip);

        CargoShip ship1 = new CargoShip();
        ship1.setTeammates(20);
        ship1.setCargoLimit(30);

        CargoShip ship2 = new CargoShip();
        ship2.setTeammates(30);
        ship2.setCargoLimit(50);

        Ship cargoShipWithAddictionalSize = ShipFactory.createShip(CARGOSHIPWITHADDICTIONALSIZE);
        System.out.println(cargoShipWithAddictionalSize);

    }
}
