package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarningCounterTest extends LimitedCounter {

    @Test
    public void testCount() {
        WarningCounter wc = new WarningCounter(1, 3);
        wc.count();
        wc.count();
        //wc.count();
        assertThrows("Ende Gelaende", WarningCounterException.class,()-> wc.count());
    }

    @Test
    public void testUncount() {
    }
}