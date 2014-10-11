package edu.kps.java.datastructures;

import java.util.Random;

/**
 * //TODO: Write class javadoc  DOES NOT WORK CURRENTLY. NEED TO FIX THIS
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a> Date: 11/5/13 Time: 1:43 PM
 */
public class CircularQueueUsingArrayAndNoCount {
    private long[] queue;
    private int maxSize;
    private int head;
    private int tail;

    public CircularQueueUsingArrayAndNoCount(int maxSize)
    {
        this.maxSize = maxSize + 1;
        queue = new long[this.maxSize];
        head = 0;
        tail = -1;
    }

    public void enque(long val) {
        if(isFull()) {
            throw new RuntimeException("Queue is full. Cannot enque");
        }
        if(tail == maxSize - 1) {
            tail = -1;
        }
        queue[++tail] = val;
    }

    public long deque() {
        if(isEmpty()){
            throw new RuntimeException("Queue is empty. Cannot deque.");
        }
        if(head == maxSize - 1) {
            head = 0;
        }
        return queue[head++];
    }

    public boolean isEmpty() {
        return ((tail + 1 == head )|| (head + maxSize - 1 == tail));
    }

    public boolean isFull() {
        return ((tail + 2 == head) || (head + maxSize - 2 == tail));
    }

 /*   public void displayInQueueOrder() {
        int tmpHead = head;
        StringBuilder sb = new StringBuilder();
        sb.append("Array :[ ");
        for(int i = 0; i < nElems ; i++)
        {
            sb.append(queue[tmpHead++]).append(i < nElems - 1 ? "," : "");
            if(tmpHead == maxSize) {
                tmpHead = 0;
            }

        }
        sb.append(" ]");
        System.out.println(sb);
    }*/

    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Array :[ ");
        for(int i = 0; i < maxSize - 2 ; i++) {
            sb.append(queue[i]).append(i < maxSize - 2 ? "," : "");
        }
        sb.append(" ]");
        System.out.println(sb);
    }

    public static void main(String[] args)
    {
        CircularQueueUsingArrayAndNoCount queue = new CircularQueueUsingArrayAndNoCount(5);
        Random random = new Random();
        queue.enque(random.nextInt(100));
        queue.enque(random.nextInt(100));
        queue.enque(random.nextInt(100));
        queue.enque(random.nextInt(100));
        queue.display();
//        queue.displayInQueueOrder();
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());

        queue.enque(random.nextInt(100));
        queue.enque(random.nextInt(100));
        queue.enque(random.nextInt(100));
        queue.enque(random.nextInt(100));
//        queue.enque(random.nextInt(100));
//        queue.enque(random.nextInt(100));
        queue.display();
//        queue.displayInQueueOrder();
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        queue.display() ;
    }

}
