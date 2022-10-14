package models;

import java.security.InvalidParameterException;

public class WarningCounter extends LimitedCounter {

    public WarningCounter() {
        super();
    }

    public WarningCounter(Integer minCount, Integer maxCount) {
        super(minCount, maxCount);
    }

    @Override
    protected void count() {
        if (!isMaximumReached()) {
            super.count();
            return;
        }

            throw new WarningCounterException("Ende Gelaende");
        }


    @Override
    protected void uncount() {
        if (!isMinimumReached()) {
            super.uncount();
            return;
        }
        throw new InvalidParameterException("Am Ende");
    }
}
