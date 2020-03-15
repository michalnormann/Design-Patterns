package decorator.secondDecoratorExample;

import java.util.HashSet;
import java.util.Set;

public class BasicSet implements MealSet {

    @Override
    public Set<SetParts> getParts() {
        Set<SetParts> parts = new HashSet<>();
        parts.add(SetParts.SANDWICH);
        parts.add(SetParts.SMALL_DRINK);
        parts.add(SetParts.SMALL_FRIES);
        return parts;
    }

    @Override
    public double getPrice() {
        return 15d;
    }
}
