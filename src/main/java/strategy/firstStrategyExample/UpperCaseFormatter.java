package strategy.firstStrategyExample;

public class UpperCaseFormatter implements TextFormatterStrategy {

    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
