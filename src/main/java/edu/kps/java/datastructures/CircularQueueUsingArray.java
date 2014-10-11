package edu.kps.java.datastructures;

import java.util.Random;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/5/13
 * Time: 1:24 PM
 */

public class CircularQueueUsingArray
{
    private long[] queue;
    private int maxSize;
    private int head;
    private int tail;
    private int nElems;

    public CircularQueueUsingArray(int maxSize)
    {
        this.maxSize = maxSize;
        queue = new long[maxSize];
        head = 0;
        tail = -1;
        nElems = 0;
    }

    public void enque(long val) {
        if(isFull()) {
            throw new RuntimeException("Queue is full. Cannot enque");
        }
        if(tail == maxSize - 1) {
            tail = -1;
        }
        queue[++tail] = val;
        nElems++;
    }

    public long deque() {
        if(isEmpty()){
            throw new RuntimeException("Queue is empty. Cannot deque.");
        }
        if(head == maxSize) {
            head = 0;
        }
        nElems--;
        return queue[head++];
    }

    public boolean isEmpty() {
       return nElems == 0;
    }

    public boolean isFull() {
        return nElems == maxSize;
    }

    public void displayInQueueOrder() {
        int tmpHead = head;
        if(tmpHead == maxSize) {
            tmpHead = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Array :[ ");
        for(int i = 0; i < nElems ; i++)
        {
            sb.append(queue[tmpHead]).append(i < nElems - 1 ? "," : "");
            if(tmpHead == maxSize - 1) {
                tmpHead = 0;
            } else {
                tmpHead++;
            }

        }
        sb.append(" ]");
        System.out.println(sb);
    }

    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Array :[ ");
        for(int i = 0; i < nElems ; i++) {
            sb.append(queue[i]).append(i < nElems - 1 ? "," : "");
        }
        sb.append(" ]");
        System.out.println(sb);
    }

    public static void main(String[] args)
    {
        CircularQueueUsingArray queue = new CircularQueueUsingArray(5);
        Random random = new Random();        // h=0 t=-1
        System.out.println("Current indexes = h=" + queue.head + ", t=" + queue.tail  );
        queue.enque(random.nextInt(100));    // h=0 t=0
        queue.enque(random.nextInt(100));    // h=0 t=1
        queue.enque(random.nextInt(100));    // h=0 t=2
        queue.enque(random.nextInt(100));    // h=0 t=3
        System.out.println("Current indexes = h=" + queue.head + ", t=" + queue.tail  );
        queue.display();
        queue.displayInQueueOrder();
        System.out.println(queue.deque());   // h=1 t=3
        System.out.println(queue.deque());   // h=2 t=3
        System.out.println(queue.deque());   // h=3 t=3
        System.out.println("Current indexes = h=" + queue.head + ", t=" + queue.tail  );

        queue.enque(random.nextInt(100));    // h=3 t=4 --> t=-1
        queue.enque(random.nextInt(100));    // h=3 t=0
        queue.enque(random.nextInt(100));    // h=3 t=1
        queue.enque(random.nextInt(100));    // h=3 t=2
        System.out.println("Current indexes = h=" + queue.head + ", t=" + queue.tail  );
//        queue.enque(random.nextInt(100));
//        queue.enque(random.nextInt(100));
        queue.display();
        queue.displayInQueueOrder();
        System.out.println(queue.deque());   // h=4 t=2
        System.out.println(queue.deque());   // h=5 t=2
        System.out.println(queue.deque());   // h=1 t=2
        System.out.println(queue.deque());   // h=2 t=2
        System.out.println(queue.deque());   // h=3 t=2
        System.out.println(queue.deque());   // h=3 t=2
        System.out.println("Current indexes = h=" + queue.head + ", t=" + queue.tail  );
        queue.display();
        queue.displayInQueueOrder();

    }
}
