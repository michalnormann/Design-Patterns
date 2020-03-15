package decorator.secondDecoratorExample;

import java.util.HashSet;
import java.util.Set;

public class LargeDrinkDecorator implements MealSet{

    private MealSet set;

    public LargeDrinkDecorator(MealSet set) {
        this.set = set;
    }

    @Override
    public Set<SetParts> getParts() {
        Set<SetParts> parts = new HashSet<>(this.set.getParts());
        parts.remove(SetParts.SMALL_DRINK);
        parts.add(SetParts.LARGE_DRINK);
        return parts;
    }

    @Override
    public double getPrice() {
        if(this.set.getParts().contains(SetParts.LARGE_DRINK)) {
            return this.set.getPrice();
        }
        return this.set.getPrice() + 2d;
    }
}
