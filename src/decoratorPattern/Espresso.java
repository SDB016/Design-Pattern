package decoratorPattern;

public class Espresso implements Beverage {
    private final int cost = 3000;
    @Override
    public int cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "에스프레소";
    }
}
