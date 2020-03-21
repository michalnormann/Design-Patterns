package factory.firstFactoryExample;

public class CargoShip extends Ship {

    @Override
    public void flowSpeed() {
        System.out.println("Speed: 10");
    }

    private int cargoLimit;

    public int getCargoLimit() {
        return cargoLimit;
    }

    public void setCargoLimit(int cargoLimit) {
        this.cargoLimit = cargoLimit;
    }

    private int teammates;

    public int getTeammates() {
        return teammates;
    }

    public void setTeammates(int teammates) {
        this.teammates = teammates;
    }

    @Override
    public String toString() {
        flowSpeed();
        return "CargoShip{" +
                "cargoLimit=" + cargoLimit +
                ", teammates=" + teammates +
                '}';
    }
}
