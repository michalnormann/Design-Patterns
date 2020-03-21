package strategy.firstStrategyExample;

public class CapitalizeFormatter implements TextFormatterStrategy {

    @Override
    public String format(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
