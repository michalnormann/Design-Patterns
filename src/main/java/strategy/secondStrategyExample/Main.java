package strategy.secondStrategyExample;

public class Main {
    public static void main(String[] args) {
        //szybki przyklad w skrócie
        String s = makeTshirt(Size.XL);
        System.out.println(s);
    }

    public static String makeTshirt(Size size) {
        if(size == Size.S)
            return "zrobiłem koszulkę w rozmiarze S";
        if(size == Size.L)
            return "zrobiłem koszulkę w rozmiarze L";
        if(size == Size.XL)
            return "zrobiłem koszulkę w rozmiarze XL";
        return null;
    }
}
