package edu.kps.java.datastructures;

import java.util.Random;

/**
 * //A array based Stack used only for long values.
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/5/13
 * Time: 10:29 AM
 */
public class StackOfLongUsingArray implements StackOfLong {

    private long[] a;
    private int top;
    private int maxSize;

    public StackOfLongUsingArray(int maxSize) {
        this.maxSize = maxSize;
        a = new long[maxSize];
        top = -1;
    }

    public void push(long val) {
        if(top == maxSize - 1) {
            throw new RuntimeException("Max elements exceeded.");
        }
        a[++top] = val;
    }

    public long peek() {
        return a[top];
    }

    public long pop() {
        if(top == -1) {
            throw new RuntimeException("No elements on the stack.");
        }
        return a[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args)
    {
        int max = 10;
        StackOfLongUsingArray stack = new StackOfLongUsingArray(max);
        Random random = new Random();
        for(int i = 0 ; i < max; i++) {
            stack.push(random.nextInt(100));
        }

        StringBuilder sb = new StringBuilder("Elements in the stack are :[ ");
        for(int i = 0; i < max; i++){
            sb.append(stack.pop()).append(i < max - 1 ?",":"");
        }
        sb.append(" ]");
        System.out.println(sb.toString());
    }


}
