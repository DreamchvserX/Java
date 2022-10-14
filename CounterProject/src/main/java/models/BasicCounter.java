package models;

public abstract class BasicCounter {

    private Integer counted;
    private Integer initalCount;


    protected BasicCounter(){
        this(0);
    }
    protected BasicCounter(Integer initCount){
        this.counted = initalCount = initCount;
    }

    public Integer currentCount(){return this.counted;}
    public void reset(){this.counted=initalCount;}
    protected void count(){++counted;}
    protected void uncount(){--counted;}
    protected void setCount(Integer count){this.counted = count;}


}
