package edu.kps.java.recursion;

/**
 * Created with IntelliJ IDEA.
 * User : kp
 * Date : 10-10-2014
 * Time : 06:10 PM
 *
 * abc
 * a bc, a cb
 * b ac, b ca
 * c ab, c ba
 *
 * abcd
 * a with perm of bcd
 * b with perm of acd
 * c with perm of abd
 * d with perm of abc
 */
public class Permutations {


    public static void permuteString(String beginningString, String endingString) {
        if (endingString.length() <= 1)
            System.out.println(beginningString + endingString);
        else
            for (int i = 0; i < endingString.length(); i++) {
                try {
                    String newString = endingString.substring(0, i) + endingString.substring(i + 1);

                    permuteString(beginningString + endingString.charAt(i), newString);
                } catch (StringIndexOutOfBoundsException exception) {
                    exception.printStackTrace();
                }
            }
    }
    public static void main(String[] args) {
        String str = "abcd";
        permuteString("", str);
    }
}

