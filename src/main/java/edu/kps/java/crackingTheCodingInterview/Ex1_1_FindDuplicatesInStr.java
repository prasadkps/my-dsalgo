package edu.kps.java.crackingTheCodingInterview;


import static edu.kps.java.util.CommonUtils.*;

/**
 * //TODO: Assumption is that the String is ASCII
 *
 * @author <a href="mailto:prasad.kps@gmail.com">Krishnaprasad Shivdasan</a><br/>
 * Date: 11/14/13
 * Time: 3:28 PM
 */
public class Ex1_1_FindDuplicatesInStr
{
    public static boolean checkForDuplicateChar(String str)
    {

        boolean[] occurrence = new boolean[256];
        if (str == null) {
            return false;
        }
        if (str.length() > 256) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if (occurrence[ch]) {
                return true;
            }
            else {
                occurrence[ch] = true;
            }
        }
        return false;
    }

    public static boolean checkForDuplicateCharWithoutExtraDS(String str){
        for(int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
//            for(int j = 0; j < i; j++) {
            for(int j = i+1; j < str.length(); j++) {
                if(str.charAt(j) == ch) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkForDuplicateCharUsingBitVector(String str) {
        if(str.length() > 256) {
            return false;
        }
        int checker = 0;
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0) {
                return false;
            }
            checker |=  (1 << val);
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str = readSingleInput();
        do {
            boolean dupCheck1 = checkForDuplicateChar(str);
            System.out.println("Duplicate Check Status using bool lookup = " + dupCheck1);
            boolean dupCheck2 = checkForDuplicateCharWithoutExtraDS(str);
            System.out.println("Duplicate Check Status w/o extra DS = " + dupCheck2);
            boolean dupCheck3 = checkForDuplicateCharUsingBitVector(str);
            System.out.println("Duplicate Check Status using bit vector = " + dupCheck3);
        }while (!(str = readSingleInput()).equals("")) ;
    }


}
