package edu.kps.java.problems;

import static edu.kps.java.util.CommonUtils.*;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 11/26/13
 * Time: 9:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayOrderReversal {

    public static void reverse(int[] arr){
        int n = arr.length-1;
        int i = 0;
        int temp;
        while(i < n-i){
            temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = getRandomInput(11, 100);
        display(arr);
        reverse(arr);
        display(arr);
    }
}
