package edu.kps.java.crackingTheCodingInterview;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User : kp
 * Date : 10-10-2014
 * Time : 10:20 AM
 */
public class Ex3_6SortItemsInStackUsingOnlyExtraStacks {

    private Stack<Integer> origStack = new Stack<>();
    private Stack<Integer> tempStack1 = new Stack<>();
    private Stack<Integer> tempStack2 = new Stack<>();

    public void sort() {
        tempStack1.addAll(origStack);
        origStack.clear();
        sortInternal(tempStack1, tempStack2);
    }

    private void sortInternal(Stack<Integer> stack1, Stack<Integer> stack2) {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return;
        }
        int min = -1;
        Integer i;
        while (!stack1.isEmpty()) {
            i = stack1.pop();
            if (min == -1) {
                min = i;
            } else if (i < min) {
                stack2.push(min);
                min = i;
            } else {
                stack2.push(i);
            }
        }
        origStack.push(min);
        sortInternal(stack2, stack1);
    }

    public void sortWith1ExtraStack() {
        Stack<Integer> stack2 = new Stack<>();
        while (!origStack.isEmpty()) {
            int val = origStack.pop();
            while (!stack2.isEmpty() && (stack2.peek() > val)) {
                origStack.push(stack2.pop());
            }
            stack2.push(val);
        }
        origStack.addAll(stack2);
    }

    public void populateStack(Integer i) {
        origStack.push(i);
    }

    public void print() {
        System.out.println(origStack);
    }

    public static void main(String[] args) {
        Ex3_6SortItemsInStackUsingOnlyExtraStacks ex = new Ex3_6SortItemsInStackUsingOnlyExtraStacks();
        ex.populateStack(7);
        ex.populateStack(3);
        ex.populateStack(10);
        ex.populateStack(2);
        ex.populateStack(5);
        ex.populateStack(4);
        ex.print();
        ex.sortWith1ExtraStack();
        ex.print();
    }
}
