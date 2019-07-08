package builder.CarExample;

import static builder.CarExample.FuelType.DIESEL;
import static builder.CarExample.FuelType.PETROL;

public class Application {
    public static void main(String[] args) {
Engine engine = new EngineBuilder()
        .withEngineCapacity(1.5)
        .withFuelType(DIESEL)
        .withTurbo(true)
        .build();

Car car1 = new CarBuilder()
        .withMark("Ford")
        .withModel("Focus")
        .withYearOfProduction(2016)
        .withEngine(engine)
        .withColour("Silver")
        .build();

Car car2 = new CarBuilder()
        .withMark("Ford")
        .withModel("Fiesta")
        .withYearOfProduction(2016)
        .withEngine(engine)
        .withColour("Silver")
        .build();

Car car3 = new CarBuilder()
        .withMark("Ford")
        .withModel("Fiesta")
        .withYearOfProduction(2019)
        .withEngine(new Engine(1.2, PETROL, false))
        .withColour("Blue")
        .build();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
