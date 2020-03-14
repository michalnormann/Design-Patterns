package decorator.firstDecoratorExample;

public class Main {
    public static void main(String[] args) {
        Car i20Car = new i20Car();
        System.out.println("i20 price: " + i20Car.price());
        System.out.println("i20 description: " + i20Car.description());

        Car i20withArmrester = new Armrest(i20Car);
        System.out.println("i20withArmrester price: " + i20withArmrester.price());
        System.out.println("i20withArmrester description: " + i20withArmrester.description());

        Car i20withArmresterAndParkingSensor = new ParkingSensor(i20withArmrester);
        System.out.println("i20withArmresterAndParkingSensor price: " + i20withArmresterAndParkingSensor.price());
        System.out.println("i20withArmresterAndParkingSensor description: " + i20withArmresterAndParkingSensor.description());

        Car carWithDoubleTires = new WinterTires(new WinterTires(i20withArmresterAndParkingSensor));
        System.out.println("carWithDoubleTires price: " + carWithDoubleTires.price());
        System.out.println("carWithDoubleTires description: " + carWithDoubleTires.description());

        Car i30Car = new Armrest(new ParkingSensor((new i30Car())));
        System.out.println("i30withArmresterAndParkingSensor price: " + i30Car.price());
        System.out.println("i30withArmresterAndParkingSensor description: " + i30Car.description());



    }
}
