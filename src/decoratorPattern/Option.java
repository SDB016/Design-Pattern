package decoratorPattern;

public abstract class Option implements Beverage{
    private Beverage beverage;

    public Option(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
