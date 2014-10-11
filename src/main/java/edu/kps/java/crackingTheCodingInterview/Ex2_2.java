package edu.kps.java.crackingTheCodingInterview;

import edu.kps.java.datastructures.Node;

/**
 * Created with IntelliJ IDEA.
 * User : kp
 * Date : 07-10-2014
 * Time : 11:54 AM
 */
public class Ex2_2 {

    public static int nthToLastUsingRecursion(Node<Integer> head, int n) {
        if(head == null) {
            return 0;
        }

        int i = nthToLastUsingRecursion(head.getNext(), n) + 1;
        if(i == n) {
            System.out.println("Kth Element to the last in Linked List = " + head.getVal());
        }
        return i;
    }

    public static int nthToLastIterative(Node<Integer> head, int n) {
        Node<Integer> p1 = head;
        Node<Integer> p2 = head;
        for (int i = 0; i < n - 1 ; i++ ) {
            if(p2 == null) {
                return -1;
            }
            p2 = p2.getNext();
        }
        while(p2.getNext() != null) {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        System.out.println("Kth Element to the last in Linked List = " + p1.getVal());
        return p1.getVal();
    }


    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> node;
        node = new Node<>(2);
        head.setNext(node);
        Node<Integer> cur = node;
        node = new Node<>(3);
        cur.setNext(node);
        cur = node;
        node = new Node<>(4);
        cur.setNext(node);
        cur = node;
        node = new Node<>(5);
        cur.setNext(node);
        cur = node;
        node = new Node<>(6);
        cur.setNext(node);
        cur = node;

        node = new Node<>(7);
        cur.setNext(node);
        cur = node;

        node = new Node<>(8);
        cur.setNext(node);
        cur = node;

        node = new Node<>(9);
        cur.setNext(node);
        cur = node;

        node = new Node<>(1);
        cur.setNext(node);
        cur = node;

        node = new Node<>(2);
        cur.setNext(node);
        cur = node;

        node = new Node<>(3);
        cur.setNext(node);
        cur = node;

        System.out.println("List = " + head.printList());
        nthToLastUsingRecursion(head, 5);
        nthToLastIterative(head, 5);

    }
}
