package models;

import java.util.Objects;

public abstract class LimitedCounter extends BasicCounter{

    private static Integer DEFAULT_MAXIMUM = 999;
    private static Integer DEFAULT_MINIMUM = 0;
    private Integer maximumCount;
    private Integer minimumCount;



    public Boolean isMaximumReached() {
        if (maximumCount == currentCount()) {
            System.out.println("Maximum wurde erreicht");return true;
        }return false;
    }

    public Boolean isMinimumReached() {
        if (Objects.equals(minimumCount, currentCount())) {
            System.out.println("Minimum wurde erreicht");return true;
        }return false;
    }

    protected LimitedCounter(Integer min, Integer max) {
        super(min);

        this.minimumCount = min;
        this.maximumCount = max;
    }

    protected LimitedCounter() {

    }

    public Integer maximumIs(){
        return this.maximumCount;
    }

    public Integer minimumIs(){
        return this.minimumCount;
    }

}
