package factory.firstFactoryExample;

public class ShipFactory {

    public static Ship createShip(ShipType ship) {
        if(ship.CARGO_SHIP == ship) {
            CargoShip cargoShip = new CargoShip();
            cargoShip.setCargoLimit(100);
            cargoShip.setTeammates(10);
            return cargoShip;
        } else if (ship.CARGOSHIPWITHADDICTIONALSIZE == ship) {
            CargoShip cargoShipWithAddictionalSize = new CargoShip();
            cargoShipWithAddictionalSize.setCargoLimit(200);
            cargoShipWithAddictionalSize.setTeammates(10);
            return cargoShipWithAddictionalSize;
        } else if (ship.TRANSPORT_SHIP == ship) {
            return new TransportShip();
        } else if (ship.WAR_SHIP == ship) {
            return new WarShip();
        }
        return null;
    }
}
