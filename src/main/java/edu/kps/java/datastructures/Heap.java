package edu.kps.java.datastructures;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 11/26/13
 * Time: 12:47 PM
 */
public class Heap {

    private Comparable[] a;
    private int N ;
    private int maxN;

    public Heap( int n) {
        maxN = n + 1;
        a = new Comparable[maxN + 1];
    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k/2, k);
            k = k/2;
        }
    }

    private void add(Comparable k) {
        if(N + 1 > maxN) {
            throw new RuntimeException("Heap Max Size Exceeded");
        }
        a[++N] = k;
        swim(N);
    }
    private void sink(int k) {
        while (2*k < N){
            int j = 2*k;
            if(j < N && less(j, j+1)) j++;
            if(!less(k, j)) break;
            exch(k,j);
            k = j;
        }
    }

    private Comparable removeMax() {
        Comparable max = a[1];
        exch(1, N--);
        a[N+1] = null;
        sink(1);
        return max;
    }


    private boolean less(int i, int j) {
        return a[i].compareTo(a[j]) < 0;
    }

    private void exch(int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private void display() {
        if(a.length == 0) {
            System.out.println("Empty Heap");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Heap = [");
        for(int i = 1; i <= N; i++) {
            sb.append(a[i]).append((i < N)?",":"]");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.display();
        heap.add('T');
        heap.add('P');
        heap.display();
        heap.add('R');
        heap.display();
        heap.add('N');
        heap.display();
        heap.add('H');
        heap.display();
        heap.add('O');
        heap.display();
        heap.add('A');
        heap.display();
        heap.add('E');
        heap.display();
        heap.add('I');
        heap.display();
        heap.add('G');
        heap.display();
        heap.add('S');
        heap.display();
        heap.removeMax();
        heap.display();

    }




}
