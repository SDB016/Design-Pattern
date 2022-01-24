package decoratorPattern;

public class Milk extends Option{
    private final int cost = 500;

    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String addMilk() {
        return ", 우유";
    }

    @Override
    public int cost() {
        return super.cost() + cost;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addMilk();
    }
}
