package models;

public abstract class RollOverCounter extends LimitedCounter {

    public RollOverCounter(){
        super();
    }

    public RollOverCounter(Integer minCount, Integer maxCount){
        super(minCount, maxCount);
    }

    @Override
    protected void uncount(){
        if(isMinimumReached()){
            setCount(maximumIs());
        }
        super.uncount();
    }

    @Override
    public void count(){
        if(isMaximumReached()){
            setCount(minimumIs());
        }
        super.count();
    }





}
