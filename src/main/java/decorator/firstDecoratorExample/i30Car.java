package decorator.firstDecoratorExample;

public class i30Car extends Car {

    @Override
    public float price() {
        float basePrice = 30000;
        return basePrice;
    }

    @Override
    public String description() {
        return "Hyundai i30";
    }
}
