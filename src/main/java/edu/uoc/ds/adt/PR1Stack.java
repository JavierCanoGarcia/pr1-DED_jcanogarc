package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR1Stack {
    public final int CAPACITY = 15; //Cambiamos a 15 para trabajar con los 15 primeros valores.

    private Stack<Integer> stack; //Cambio a integer

    public PR1Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<>(CAPACITY);
    }


    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }

    public Stack<Integer> getStack() {
        return this.stack;
    } //Cambio a integer

    public void push(Integer i) {
        this.stack.push(i);
    }  //Cambio a integer
}

