package strategyPattern;

import strategyPattern.strategy.MovableStrategy;

public class Bus extends Moving{
    public Bus(MovableStrategy movableStrategy) {
        super(movableStrategy);
    }
}
