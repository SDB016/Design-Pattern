package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " || " + beverage.cost() + "$");

        Beverage myBeverage = new Syrup(
                new Milk(
                        new Espresso()
                )
        );

        System.out.println(myBeverage.getDescription()+ " || " + myBeverage.cost() + "$");

    }
}
