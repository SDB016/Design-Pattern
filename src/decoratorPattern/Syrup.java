package decoratorPattern;

public class Syrup extends Option{
    private final int cost = 300;

    public Syrup(Beverage beverage) {
        super(beverage);
    }

    public String addSyrup() {
        return ", 시럽";
    }

    @Override
    public int cost() {
        return super.cost() + cost;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addSyrup();
    }
}
