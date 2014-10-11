package edu.kps.java.crackingTheCodingInterview;

//import com.google.common.base.Strings;

import java.util.Arrays;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:prasadkps@gmail.com">Krishnaprasad Shivdasan</a><br/> Date: 11/14/13 Time: 5:00 PM
 */
public class Ex1_3
{
    public static boolean strPermutationCheck(String str1, String str2){
//        if(Strings.isNullOrEmpty(str1) || Strings.isNullOrEmpty(str2)) {
//            return false;
//        }
        boolean permCheck = true;
        if(str1.length() != str2.length()) {
            return false;
        }
        char[] chrStr1 = str1.toCharArray();
        char[] chrStr2 = str2.toCharArray();

        Arrays.sort(chrStr1);
        Arrays.sort(chrStr2);
        for(int i = 0 ;  i < chrStr1.length; i++) {
            if(chrStr1[i] != chrStr2[i]) {
                permCheck = false;
                break;
            }
        }
       return permCheck;
    }

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "dlooHer lWx";
        boolean permCheck = strPermutationCheck(str1, str2);
        System.out.println("Permutation Check : " + permCheck);
    }

}
