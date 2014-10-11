package edu.kps.java.problems;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 11/26/13
 * Time: 9:07 AM
 */
public class RaisingNumToLargePower {

    public static long raiseNumToPower(int x, int n) {
        int product = 1;
        int pseq = x;
        while(n > 0) {
            if(n % 2 == 1 ){
                product = product * pseq;
            }
            n /= 2;
            pseq = pseq * pseq;
        }
        return product;
    }


    public static void main(String[] args) {
        System.out.println(raiseNumToPower(2,3));
        System.out.println(raiseNumToPower(3,4));
        System.out.println(raiseNumToPower(4,5));
        System.out.println(raiseNumToPower(2,10));
        System.out.println(raiseNumToPower(2,20));
        System.out.println(raiseNumToPower(3,10));
        System.out.println(raiseNumToPower(4,10));
        System.out.println(raiseNumToPower(5,5));
        System.out.println(raiseNumToPower(6,4));
        System.out.println(raiseNumToPower(8,10));

    }
}
