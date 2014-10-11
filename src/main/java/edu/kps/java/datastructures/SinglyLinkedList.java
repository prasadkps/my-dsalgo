package edu.kps.java.datastructures;

//import java.util.Random;

/**
 * //Implementation of a Singly Linked List with only forward iterations.
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/5/13
 * Time: 12:15 PM
 */

public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public SinglyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }


    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void insert(T val){
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
    public void insertFirst(T val) {
        Node<T> node = new Node<>(val);
        Node<T> cur = head;
        head = node;
        head.setNext(cur);
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

    public void displayReverse() {
        System.out.print("LinkedList in Reverse = [ ");
        displayReverse(head);

    }

    private void displayReverse(Node cur) {
        if(cur == null) {
            return;
        } else {
            displayReverse(cur.getNext());
            System.out.print(cur.getVal()+((cur == head)?" ]" :", "));
        }
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

    public void recursiveReverse(Node<T> currentNode )
    {
        //check for empty list
        if(currentNode == null)
            return;

/* if we are at the TAIL node:
    recursive base case:
 */
        if(currentNode.getNext() == null)
        {
//set HEAD to current TAIL since we are reversing list
            head = currentNode;
            return; //since this is the base case
        }

        recursiveReverse(currentNode.getNext());
        currentNode.getNext().setNext(currentNode);
        currentNode.setNext(null); //set "old" next pointer to NULL
    }

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
//        Random random = new Random();
/*
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
        list.insert(random.nextInt(100));
*/
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
        list.insertFirst(150);
        list.insertFirst(160);
        list.insertFirst(170);
        list.insertFirst(180);
        list.insertFirst(190);
        list.insertFirst(200);
        list.display();
        Integer val = list.deleteFirst();
        System.out.println("DeleteFirst Value = " + val);
        list.display();
        val = list.deleteLast();
        System.out.println("DeleteLast Value = " + val);
        list.display();

    }
}
