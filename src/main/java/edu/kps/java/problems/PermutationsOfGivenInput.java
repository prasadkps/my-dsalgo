package edu.kps.java.problems;

/**
 */
public class PermutationsOfGivenInput {

    private static void permute(char[] input) {
        for (int i = 0; i < input.length; i++) {
//            rotate()
        }

    }

    private static char[] rotate(char[] input, int numRotations,  int start) {
        for (int x = 0; x < numRotations; x++) {
            char temp = input[start];
            for (int i = start + 1; i < input.length; i++) {
                input[i - 1] = input[i];
            }
            input[input.length - 1] = temp;
        }
        return input;
    }


    public static void main(String[] args) {
        String input = "BIRD";
        System.out.println(input);
        char[] rotated = rotate(input.toCharArray(), 1, 0);
        System.out.println(rotated);
        rotated = rotate(input.toCharArray(), 1, 1);
        System.out.println(rotated);
        rotated = rotate(input.toCharArray(), 2, 1);
        System.out.println(rotated);

//        permute(input.toCharArray());
    }
}
