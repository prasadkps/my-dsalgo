package edu.kps.java.datastructures;

import java.util.Random;

/**
 * //A array based Stack used only for long values.
 *
 * @author <a href="mailto:prasad.kps@gmail.com">Krishnaprasad Shivdasan</a> Date: 11/5/13 Time: 10:29 AM
 */
public class StackOfCharUsingArray<T> implements Stack<T>
{

    private T[] a;
    private int top;
    private int maxSize;

    public StackOfCharUsingArray(int maxSize)
    {
        this.maxSize = maxSize;
//        a = new T[maxSize];
        top = -1;
    }

    @Override
    public void push(T val) {
        if (top == maxSize - 1) {
            throw new RuntimeException("Max elements exceeded.");
        }
        a[++top] = val;

    }

    public T peek()
    {
        return a[top];
    }

    public T pop()
    {
        if (top == -1) {
            throw new RuntimeException("No elements on the stack.");
        }
        return a[top--];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == maxSize - 1;
    }

    public int size()
    {
        return top + 1;
    }

    public static void main(String[] args)
    {
        int max = 10;
        StackOfCharUsingArray stack = new StackOfCharUsingArray(max);
        Random random = new Random();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        stack.push('f');

        StringBuilder sb = new StringBuilder("Elements in the stack are :[ ");
        for (int i = 0; i < max; i++) {
            sb.append(stack.pop()).append(i < max - 1 ? "," : "");
        }
        sb.append(" ]");
        System.out.println(sb.toString());
    }


}
