package edu.kps.java.datastructures.LinkedLists;

import edu.kps.java.datastructures.SinglyLinkedList;

/**
 *
 * Created by kp on 12/24/13.
 */
public class PrintListInReverse {


    public static void main(String[] args) {
      SinglyLinkedList<Integer> list  = new SinglyLinkedList<>();
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
        list.displayReverse();
    }
}
