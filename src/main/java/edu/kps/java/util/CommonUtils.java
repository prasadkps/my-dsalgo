package edu.kps.java.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a><br/> Date: 11/14/13 Time: 3:38 PM
 */
public class CommonUtils
{
    private static Random random = new Random();
    public static String readSingleInput() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            return br.readLine();
        }catch(IOException ioe){
            System.err.println("Error Reading Input: "+ ioe);
            return "";
        }
    }

    public static int[] getRandomInput(int size, int bound) {
        int[] input = new int[size];
        for(int i = 0; i < size; i++) {
            input[i] = random.nextInt(bound);
        }
        return input;
    }
    public static void display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("Array = [ ");
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(i < arr.length - 1? ",":" ]");
        }
        System.out.println(sb.toString());
    }
}
