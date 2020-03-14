package builder.phoneBuilderExample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    private String mark;
    private String model;
    private Processor processor;
    private int ram;
    private boolean camera;
}
