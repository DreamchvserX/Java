package models;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class BasicCounterTest {

    class Tester extends BasicCounter{
        Tester(){
            super();
        }
        Tester(Integer start){
            super(start);
        }
    }


    @Test
    public void currentCount_given_5_expected_5() {
        Tester counter = new Tester();
        for (int i = 0; i < 5; i++) {
            counter.count();
        }

        long res=counter.currentCount();

        assertEquals( res,5l);
    }

    @Test
    public void reset_given_Init_Val_Neg5_expected_Neg5() {
        Tester counter = new Tester(-5);
        counter.setCount(10);
        counter.uncount();
        counter.reset();
        long res=counter.currentCount();
        assertEquals(res, -5l);
    }

}