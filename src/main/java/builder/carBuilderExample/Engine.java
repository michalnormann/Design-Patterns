package builder.carBuilderExample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine {
    private double engineCapacity;
    private FuelType fuelType;
    private boolean turbo;
}
