package decorator.secondDecoratorExample;

public class Main {

//    https://pl.wikipedia.org/wiki/Dekorator_(wzorzec_projektowy)
    public static void main(String[] args) {
        MealSet set = new BasicSet();


        set = new LargeDrinkDecorator(set);

        set = new LargeFriesDecorator(set);

        System.out.println(set.getParts());
        System.out.println(set.getPrice());
    }
}
