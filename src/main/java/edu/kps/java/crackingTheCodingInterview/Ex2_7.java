package edu.kps.java.crackingTheCodingInterview;

import edu.kps.java.datastructures.Node;
import edu.kps.java.datastructures.SinglyLinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User : kp
 * Date : 06-10-2014
 * Time : 07:54 PM
 */
public class Ex2_7 {


    public static boolean checkIsPalindromeUsingReverse(SinglyLinkedList<Character> list) {
        boolean isPalindrome = true;
        SinglyLinkedList<Character> reverseList = new SinglyLinkedList<>();
/*
        Collections.reverse(reverseList);
        for(int i = 0; i < list.size() ; i++) {
            if(list.get(i) != reverseList.get(i)) {
                isPalindrome = false;
                break;
            }
        }
*/
        return isPalindrome;
    }

    public static boolean checkIsPalindromeUsingStack(Node<Character> head) {
        boolean isPalindrome = true;
        if(head == null) {
            return false;
        }
        int size = 0;
        Stack<Character> stack = new Stack<>();
        Character c;
        Node<Character> cur = head;
        do {
            stack.push(cur.getVal());
            size++;
        }while((cur = cur.getNext()) != null);

        for(int i = 0; i  < size/2 ; i++) {
            if(stack.pop() != head.getVal()){
                return false;
            }
            head = head.getNext();
        }
        return isPalindrome;
    }

    public static void checkIsPalindromeUsingRecursion (Node<Character> head) {
        if(head == null) {
            return ;
        }
        if(head.getNext() != null) {

        }

//        list.
        return ;
    }


    public static void main(String[] args) {
        SinglyLinkedList<Character> list1 = new SinglyLinkedList<>();

        list1.insert('M');
        list1.insert('a');
        list1.insert('l');
        list1.insert('a');
        list1.insert('y');
        list1.insert('a');
        list1.insert('l');
        list1.insert('a');
        list1.insert('M');

//        boolean isPalindrome = checkIsPalindromeUsingReverse(list1);
        boolean isPalindrome = checkIsPalindromeUsingStack(list1.getHead());
        System.out.println("Is Palindrome : "+ isPalindrome);
    }

}
