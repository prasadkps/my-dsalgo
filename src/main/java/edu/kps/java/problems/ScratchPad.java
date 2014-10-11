package edu.kps.java.problems;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 12/5/13
 * Time: 1:42 PM
 */
public class ScratchPad {

    public static boolean divisibleByFive(int n) {
        if((n & 1) == 1) {
            n <<= 1;
        }
        int x = (int)(n * 0.1) * 10;
        if(x == n) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println("Is 5 divisible by 5 :" + divisibleByFive(5));
        System.out.println("Is 5 divisible by 35 :" + divisibleByFive(35));
        System.out.println("Is 5 divisible by 37 :" + divisibleByFive(37));
        System.out.println("Is 5 divisible by 578435 :" + divisibleByFive(578435));
        System.out.println("Is 5 divisible by 494540 :" + divisibleByFive(494540));
        System.out.println("Is 5 divisible by 40 :" + divisibleByFive(40));
        System.out.println("Is 5 divisible by 445423 :" + divisibleByFive(445423));
        System.out.println("Is 5 divisible by 4545 :" + divisibleByFive(4545));
        System.out.println("Is 5 divisible by 5544 :" + divisibleByFive(5544));
        System.out.println("Is 5 divisible by 5543 :" + divisibleByFive(5543));
        System.out.println("Is 5 divisible by 555000 :" + divisibleByFive(555000));

    }
}
