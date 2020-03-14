package decorator.firstDecoratorExample;

public class WinterTires extends CarAcessoriesDecorator {

    private Car car;

    public WinterTires(Car car) {
        this.car = car;
    }

    @Override
    public float price() {
        return car.price() + 800f;
    }

    @Override
    public String description() {
        return car.description() + " with winter tires";
    }
}
