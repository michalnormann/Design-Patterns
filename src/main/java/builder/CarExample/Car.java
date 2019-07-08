package builder.CarExample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String mark;
    private String model;
    private Engine engine;
    private int yearOfProduction;
    private String colour;
}
