package decorator.firstDecoratorExample;

public class Armrest extends CarAcessoriesDecorator {

    private Car car;

    public Armrest(Car car) {
        this.car = car;
    }

    @Override
    public float price() {
        return car.price() + 500f;
    }

    @Override
    public String description() {
        return car.description() + " with armrest";
    }
}
