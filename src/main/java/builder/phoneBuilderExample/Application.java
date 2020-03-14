package builder.phoneBuilderExample;

import static builder.phoneBuilderExample.Processor.Apple_A11_Bionic;
import static builder.phoneBuilderExample.Processor.Samsung_Exynos_8895;

public class Application {
    public static void main(String[] args) {
        Phone phone1 = new PhoneBuilder()
                .withMark("Apple")
                .withModel("XR")
                .withProcessor(Apple_A11_Bionic)
                .withRam(4)
                .withCamera(true)
                .build();

        Phone phone2 = new PhoneBuilder()
                .withMark("Samsung")
                .withModel("Note 8")
                .withProcessor(Samsung_Exynos_8895)
                .withRam(6)
                .withCamera(true)
                .build();

        System.out.println(phone1);
        System.out.println(phone2);
    }
}
