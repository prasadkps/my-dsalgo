package edu.kps.java.crackingTheCodingInterview;

import static edu.kps.java.util.CommonUtils.readSingleInput;

/**
 * Program to reverse the characters in a String.
 * Exchange the first char with the last char and increment / decrement the pointer till they both pass each other.
 * Created by kp on 5/1/14.
 */
public class Ex1_2_ReverseStr {
    public static String reverseStr(String input) {
        char[] inputArr = input.toCharArray();
        int len = input.length();
        int j = len - 1;
        int i = 0;
        while(i <= j ) {
            char t = inputArr[i];
            inputArr[i] = inputArr[j];
            inputArr[j] = t;
            i++;
            j--;
        }
        return new String(inputArr);
    }

    public static void main(String[] args) {
        String str = readSingleInput();
        do {
            String reversedStr = reverseStr(str);
            System.out.println("Reversed String :" + reversedStr);
        }while (!(str = readSingleInput()).equals("")) ;
    }
}
