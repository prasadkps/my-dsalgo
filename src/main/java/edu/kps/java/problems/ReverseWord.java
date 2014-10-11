package edu.kps.java.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * //Class to reverse a input word using a array based stack.
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/5/13
 * Time: 10:59 AM
 */
public class ReverseWord
{

    private char[] a;
    private int top;
    private int maxSize;

    public ReverseWord() {
        top = -1;
    }


    private void push(char val) {
        if(top == maxSize - 1) {
            throw new RuntimeException("Max elements exceeded.");
        }
        a[++top] = val;
    }

    private char peek() {
        return a[top];
    }

    public char pop() {
        if(top == -1) {
            throw new RuntimeException("No elements on the stack.");
        }
        return a[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }
    private void populateStack(String str)
    {
        maxSize = str.length();
        a = new char[maxSize];
        for (int i = 0; i < str.length(); i++) {
            push(str.charAt(i));
        }
    }

    public String reverseWord(String inStr)
    {
        populateStack(inStr);
        StringBuilder reverseStr = new StringBuilder("");
        while (!isEmpty()) {
            reverseStr.append(pop());
        }
        return reverseStr.toString();
    }


    public static void main(String[] args) throws IOException
    {
        String inStr = "HelloWorld";
        ReverseWord rw = new ReverseWord();
        System.out.println(rw.reverseWord(inStr));
        String input;
        while(true){
            System.out.print("Enter a String (Empty to Quit) : ");
            System.out.flush();
            input = rw.getString();
            if(input.equals("")) {
                break;
            }
            System.out.println(rw.reverseWord(input));
        }
    }

    private String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
