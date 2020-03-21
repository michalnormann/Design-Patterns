package factory.firstFactoryExample;

public class TransportShip extends Ship {

    @Override
    public void flowSpeed() {
        System.out.println("Speed: 20");
    }

    @Override
    public String toString() {
        return "Speed: 20";
    }
}
