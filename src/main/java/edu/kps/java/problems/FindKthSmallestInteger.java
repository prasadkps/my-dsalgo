package edu.kps.java.problems;

import static edu.kps.java.util.CommonUtils.*;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 11/26/13
 * Time: 9:27 AM
 */
public class FindKthSmallestInteger {

    public static void partition(int[] input, int k) {
        int i = 0;
        int j = input.length - 1;
        while (input[i] < k && i < j) i++;
        while( input[j] > k && i < j) j--;
        do {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            while (input[i] < k && i < j) i++;
            while( input[j] > k && i < j) j--;
        } while( i < j);
    }
    public static int findKthSmallestInteger(int[] input, int k) {
        int l = 0;
        int u = input.length - 1;
        int x = 0;
        while( l < u) {
            int i = l;
            int j = u;
            x = input[k];
            while( i <= k && j >= k ) {
                while(input[i] < x) i++;
                while(input[j] > x) j--;
                int t = input[i];
                input[i] = input[j];
                input[j] = t;
                if (j < k) l = i;
                if( i > k) u = i;
                i++;
                j--;
            }
        }
      return x;
    }

    public static void main(String[] args) {
        int[] input = getRandomInput(15, 100);
//        display(input);
//        partition(input, 50);
        display(input);
        int kthSmallest = findKthSmallestInteger(input, 5);
        System.out.println("Kth Smallest in array = " + kthSmallest);
    }
}
