package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class LimitedCounterTest extends BasicCounter {


   Mock zentralTesterMitParams;
   Mock zentralerTesterDefault;

    public LimitedCounterTest(){
        this.zentralerTesterDefault = new Mock();
        this.zentralTesterMitParams = new Mock(-10,22);
    }

    class Mock extends LimitedCounter{
        protected Mock(){
            super();
        }
        protected Mock(Integer min, Integer max){
            super(min, max);
        }
    }

    @Test
    public void minimumIs_and_isMinimumReached(){
        zentralTesterMitParams.setCount(-8);
        zentralTesterMitParams.uncount();
        zentralTesterMitParams.uncount();
        var bed1 = zentralTesterMitParams.isMinimumReached();
        var bed2 = (int) zentralTesterMitParams.minimumIs() == -10;
        assertEquals(bed1,bed2);
    }

    @Test
    public void testParamConstructor(){
        assertEquals( -10l, (long) zentralTesterMitParams.currentCount());
    }


    @Test
    public void maximumIs_and_isMaximumReached() {
        zentralTesterMitParams.setCount(20);
        zentralTesterMitParams.count();
        zentralTesterMitParams.count();
        var bed1 = zentralTesterMitParams.isMaximumReached();
        var bed2 = (int) zentralTesterMitParams.maximumIs() == 22;
        assertEquals(bed1,bed2);
    }


}