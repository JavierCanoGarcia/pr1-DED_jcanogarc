package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1QueueTest {

    PR1Queue pr1q;


    private void fillQueue() {
        for (int i = 0; i < 15; i++) {
            pr1q.add(PR1PeriodicFunction.calculate(i));

        }
    }
    @Before
    public void setUp() {
        this.pr1q = new PR1Queue();

        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(this.pr1q.CAPACITY, this.pr1q.getQueue().size());

        // Comprobación de los valores correctos esperados de la función periódica
        assertEquals(Integer.valueOf(0), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(1), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(4), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(9), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(0), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(1), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(4), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(9), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(0), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(1), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(4), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(9), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(0), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(1), this.pr1q.getQueue().poll());
        assertEquals(Integer.valueOf(4), this.pr1q.getQueue().poll());

        assertEquals(0, this.pr1q.getQueue().size());
    }

}
