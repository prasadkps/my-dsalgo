package edu.kps.java.problems;

import edu.kps.java.datastructures.StackOfCharUsingArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * //TODO: Write class javadoc   DOES NOT WORK. NEED TO FIX THIS.
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/5/13
 * Time: 3:26 PM
 */
public class InfixToPostfix {

    private StackOfCharUsingArray stack;
    private String infixStr;

    public InfixToPostfix(String infixStr)
    {
        stack = new StackOfCharUsingArray(infixStr.length());
        this.infixStr = infixStr;
    }

    public String doTrans() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < infixStr.length(); i++) {
            char ch = infixStr.charAt(i);
            switch (ch) {
                case '+':
                case '-' :
//                    gotOperator(ch, 1);
                    break;
                case '*' :
                case '/' :

                    break;
                case '(' :
                    break;
                case ')' :
                    break;
                default:
                    sb.append(ch);

            }
        }
        return sb.toString();
    }

/*
    private void gotOperator (char ch, int precedence){
        char ch1;
        if(stack.isEmpty()) {
            stack.push(ch);
        } else {
            ch1 = stack.peek();
        }
        if(ch1 == '(') {     // If the operator is a '(' restore it back.
            stack.push(ch1);
            break;
        }
        if (precedence == 2)
    }
*/
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String infixStr = br.readLine();
        InfixToPostfix itf = new InfixToPostfix(infixStr);
        String postfixStr = itf.doTrans();
        System.out.println("Infix Expression = " + infixStr);
        System.out.println("PostFix Expression = " + postfixStr);

    }
}
