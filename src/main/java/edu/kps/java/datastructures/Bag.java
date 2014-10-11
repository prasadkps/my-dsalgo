package edu.kps.java.datastructures;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 11/26/13
 * Time: 4:41 PM
 */
public class Bag<T> implements Iterable<T>{
    private Node first;

    private class Node {
        T item;
        Node next;
    }

    public void add(T item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }
        public void remove() {
            throw new UnsupportedOperationException("Method remove is not supported.");
        }

        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}
