package builder.carBuilderExample;

public class CarBuilder {

    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public CarBuilder withMark(String mark) {
        car.setMark(mark);
        return this;
    }

    public CarBuilder withModel(String model) {
        car.setModel(model);
        return this;
    }

    public CarBuilder withEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder withYearOfProduction(int yearOfProduction) {
        car.setYearOfProduction(yearOfProduction);
        return this;
    }

    public CarBuilder withColour(String colour) {
        car.setColour(colour);
        return this;
    }

    public Car build() {
        return car;
    }
}