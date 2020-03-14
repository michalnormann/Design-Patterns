package decorator.firstDecoratorExample;

public class i40Car extends Car {

    @Override
    public float price() {
        float basePrice = 40000;
        return basePrice;
    }

    @Override
    public String description() {
        return "Hyundai i40";
    }
}
