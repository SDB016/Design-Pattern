package strategyPattern;

import strategyPattern.strategy.LoadStrategy;
import strategyPattern.strategy.RailLoadStrategy;

public class Main {
    public static void main(String[] args) {
        Moving bus = new Bus(new LoadStrategy());
        bus.move();

        Moving train = new Train(new RailLoadStrategy());
        train.move();

        bus.setMovableStrategy(new RailLoadStrategy());
        bus.move();

    }
}
