package models;

public class StoppingCounter extends LimitedCounter {
    public StoppingCounter() {
        super();
    }

    public StoppingCounter(Integer minCount, Integer maxCount) {
        super(minCount, maxCount);
    }

    @Override
    protected void count() {
        if (!isMaximumReached()) {
            super.count();
        }
    }

    @Override
    protected void uncount() {
        if (!isMinimumReached()) {
            super.uncount();
        }
    }
}
