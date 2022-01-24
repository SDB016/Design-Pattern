package strategyPattern;

import strategyPattern.strategy.MovableStrategy;

public class Moving {
    private MovableStrategy movableStrategy;

    public Moving(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }

    public void setMovableStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }

    public void move() {
        movableStrategy.move();
    }
}
