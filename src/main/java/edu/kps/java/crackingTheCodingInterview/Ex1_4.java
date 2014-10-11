package edu.kps.java.crackingTheCodingInterview;

import edu.kps.java.util.CommonUtils;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:prasad.kps@gmail.com">Krishnaprasad Shivdasan</a><br/> Date: 11/14/13 Time: 6:11 PM
 */
public class Ex1_4
{
    public static String subsSpacesWithStr(char[] str, int trueLen)
    {
        System.out.println(str);
        System.out.println(trueLen);
        char[] subsStr = {'%', '2', '0'};
        int length = str.length - 1;
        System.out.println(length);
        for (int i = trueLen - 1; i > 0; i--) {
            if (str[i] == ' ') {
                str[length--] = subsStr[2];
                str[length--] = subsStr[1];
                str[length--] = subsStr[0];
            } else {
                str[length--] = str[i];
            }
        }
        return new String(str);
    }

    public static void main(String[] args)
    {
        String str = CommonUtils.readSingleInput();
        String subsString = subsSpacesWithStr(str.toCharArray(), str.trim().length());
        System.out.println("Substituted String : " + subsString);
        System.out.println("Original String : " + str);
    }
}
