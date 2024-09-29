package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR1Queue {

    public final int CAPACITY = 15; //Cambiamos a 15 para trabajar con los 15 primeros valores.


    private Queue<Integer> queue; //Cambiamos de Character a Integer

    public PR1Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }


    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        char r;
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }

    public void add(Integer i) {
        this.queue.add(i);
    }
}