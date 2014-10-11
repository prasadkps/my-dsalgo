package edu.kps.java.datastructures;

//import java.util.Random;

/**
 * //Implementation of a Sorted Singly Linked List with only forward iterations.
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/5/13
 * Time: 12:15 PM
 */

public class SortedSinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public SortedSinglyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    public void insert(T val) {
        Node<T> node = new Node<>(val);
        if(head == null ) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = tail.getNext();
        }
    }

    public T delete(T val) {
        Node<T> cur = head;
        Node<T> prev = head;
        while(cur!= null) {
              if(cur.getVal() == val) {
                  if(cur == head) {
                      head = head.getNext();
                  }
                  prev.setNext(cur.getNext());
                  return cur.getVal();
              }
            prev = cur;
            cur = cur.getNext();
        }
        throw new RuntimeException("Value " + val + " not found.");
    }


    public Node find(T val) {
        Node cur = head;
        while(cur != null) {
            if(cur.getVal() == val){
                return cur;
            }
            cur = cur.getNext();
        }
        return null;
    }

    public T deleteFirst() {
        Node<T> cur = head;
        head = cur.getNext();
        T ret = cur.getVal();
        return ret;
    }

    public T deleteLast() {
        Node<T> cur = head;
        Node<T> prev = head;
        while(cur.getNext() != null) {
            prev = cur;
            cur = cur.getNext();
        }
        tail = prev;
        prev.setNext(null);
        return cur.getVal();
    }

    public void display() {
        Node<T> tmp = head;
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList = [ ");
        while (tmp != null){
            sb.append(tmp.display()).append(", ");
            tmp = tmp.getNext();
        }
        System.out.println(sb.substring(0, sb.length() - 2) + " ]");
    }

    public void reverseList() {
        Node<T> cur = head.getNext();
        Node<T> prev = head;
        Node<T> next = cur.getNext();
        prev.setNext(null);
        tail = head;
        do {
            cur.setNext(prev);
            prev = cur;
            cur = next;
            next = cur != null ?cur.getNext(): null;
        } while(cur != null);
        head = prev;
    }
    public static void main(String[] args) {

        SortedSinglyLinkedList<Integer> list = new SortedSinglyLinkedList<>();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insert(90);
        list.insert(100);
        list.insert(110);
        list.display();
        list.delete(50);
        list.delete(110);
        list.delete(10);
        list.display();
        list.reverseList();
        list.display();
        Node node = list.find(70);
        System.out.println(node.display());
        System.out.println(node);
        list.display();
        Integer val = list.deleteFirst();
        System.out.println("DeleteFirst Value = " + val);
        list.display();
        val = list.deleteLast();
        System.out.println("DeleteLast Value = " + val);
        list.display();

    }
}
