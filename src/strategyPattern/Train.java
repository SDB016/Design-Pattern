package strategyPattern;

import strategyPattern.strategy.MovableStrategy;

public class Train extends Moving{
    public Train(MovableStrategy movableStrategy) {
        super(movableStrategy);
    }
}
