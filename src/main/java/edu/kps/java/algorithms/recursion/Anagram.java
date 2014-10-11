package edu.kps.java.algorithms.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * //TODO: Complete THIS LATER. Currently NOT DONE
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/7/13
 * Time: 9:22 AM
 */

public class Anagram
{

    public void doAnagram(int size) {
        if(size == 1) {
            return;
        }
        for(int i = 0; i < size; i++) {
            doAnagram(size - 1);
            if(size == 2 ) {
                displayWord();
            }
            rotate(size);
        }
    }

    private void displayWord() {

    }

    private void rotate(int size) {

    }

    public static void main(String[] args) throws IOException
    {
        Anagram ra = new Anagram();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = br.readLine();
        while((input = br.readLine()).equals(" ")) {
            char[] data = new char[input.length()];
            for(int i = 0; i < input.length(); i++) {
                data[i] = input.charAt(i);
            }

            ra.doAnagram(data.length);
        }
    }

}
