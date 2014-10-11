package edu.kps.java.problems;

import edu.kps.java.util.CommonUtils;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 11/26/13
 * Time: 9:26 AM
 */
public class RemoveDuplicatesFromArray {

    public static void removeDuplicates(int[] input) {
        int n = input.length;
        int in=0;
        int on = 0;
        int temp;
        while(in < n) {
            temp = input[in++];
            input[on++] = temp;
            while( in < n && input[in] == temp) {
                in++;
            }
        }
        while(on < n) {
            input[on++] =0;
        }
    }

    public static void main(String[] args) {
        int[] input = new int[] {2,2,4,5,5,5,6,7,7,7,8,8,9,10};
//        int[] input = new int[] {2,2,2,2,2,2,2,2,2,2,2,2,2,2};
//        int[] input = new int[] {2,3,4,5,6,7,8,9,10,11,12,13,14};
        CommonUtils.display(input);
        removeDuplicates(input);
        CommonUtils.display(input);
    }
}
