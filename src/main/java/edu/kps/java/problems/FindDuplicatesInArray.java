package edu.kps.java.problems;

/**
 * Created by kp on 12/24/13.
 */
public class FindDuplicatesInArray {

    public static int findAndReturnDuplicates(int[] input) {
        if (input.length < 1) {
            throw new IllegalArgumentException("Empty Array");
        }
        int length = input.length;
        for (int anInput : input) {
            if (anInput < 0 || anInput > length - 1) {
                throw new IllegalArgumentException("Input not in valid range");
            }
        }
        for (int i = 0; i < length; i++) {
            while(input[i] != i){
                if(input[i] == input[input[i]]) {
                    return input[i];
                }
                int temp = input[i];
                input[i] = input[temp];
                input[temp] = temp;
            }
        }
        throw new IllegalArgumentException("No duplicates");
    }

    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 1, 0, 5, 3, 8, 6, 7, 9};
        System.out.println("Duplicate Found =" + findAndReturnDuplicates(input));
    }
}
