package edu.kps.java.datastructures;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/5/13
 * Time: 10:41 AM
 */

public class StackOfLongUsingArrayTest
{

    @Test
    public void stackOverflowTest() {
        StackOfLongUsingArray stack = new StackOfLongUsingArray(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

    }

    @Test
    public void stackUnderflowTest() {
        StackOfLongUsingArray stack = new StackOfLongUsingArray(3);
        stack.pop();
    }

    @Test
    public void stackPushTest() {
        StackOfLongUsingArray stack = new StackOfLongUsingArray(3);
        while(!stack.isFull()) {
            stack.push(new Random().nextInt(100));
        }

    }

    @Test
    public void stackPopTest() {
        StackOfLongUsingArray stack = new StackOfLongUsingArray(3);
        while(!stack.isEmpty()) {
            stack.pop();
        }
    }

    @Test
    public void stackPeekTest() {
        StackOfLongUsingArray stack = new StackOfLongUsingArray(3);
        while(!stack.isFull()) {
            stack.push(new Random().nextInt(100));
        }
        long val = stack.peek();
        System.out.println("Value peeked : " + val);
        Assert.assertEquals(stack.size(), 3);
        Assert.assertEquals(val, stack.pop());

    }

}
