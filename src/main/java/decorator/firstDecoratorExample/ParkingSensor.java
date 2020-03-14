package decorator.firstDecoratorExample;

public class ParkingSensor extends CarAcessoriesDecorator {

    private Car car;

    public ParkingSensor(Car car) {
        this.car = car;
    }

    @Override
    public float price() {
        return car.price() + 2000f;
    }

    @Override
    public String description() {
        return car.description() + " with parking sensor";
    }
}
