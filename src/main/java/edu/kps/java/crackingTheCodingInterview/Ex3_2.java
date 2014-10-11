package edu.kps.java.crackingTheCodingInterview;

import java.util.Stack;
/**
 * Created with IntelliJ IDEA.
 * User : kp
 * Date : 09-10-2014
 * Time : 05:56 PM
 */
public class Ex3_2 {

    private class MyStack extends Stack<Integer>{

        private Stack<Integer> s = new Stack<>();

        public Integer push(Integer val) {
            if(val < min()) {
                s.push(val);
            }
            return super.push(val);
        }

        public Integer pop() {
            Integer val = super.pop();
            if(val == min()) {
                s.pop();
            }
            return val;
        }
        private int min() {
            if (s == null) {
                return Integer.MAX_VALUE;
            } else {
                return s.peek();
            }
        }
    }
}
