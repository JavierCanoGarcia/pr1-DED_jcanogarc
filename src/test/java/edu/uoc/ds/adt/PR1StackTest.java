package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1StackTest {

    PR1Stack pr1s;

    private void fillStack() {
        for (int i = 0; i < 15; i++) {
            pr1s.push(PR1PeriodicFunction.calculate(i));
        }
    }

    @Before
    public void setUp() {
        this.pr1s = new PR1Stack();

        assertNotNull(this.pr1s.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr1s = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr1s.CAPACITY, this.pr1s.getStack().size());

        assertEquals(Integer.valueOf(4), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(1), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(0), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(9), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(4), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(1), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(0), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(9), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(4), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(1), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(0), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(9), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(4), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(1), this.pr1s.getStack().pop());
        assertEquals(Integer.valueOf(0), this.pr1s.getStack().pop());

        assertEquals(0, this.pr1s.getStack().size());
    }
}