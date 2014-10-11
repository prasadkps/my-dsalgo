package edu.kps.java.problems;

/**
 * Created by kp on 7/1/14.
 */
public class TowersOfHanoi {

    public static void moveDisks(int n, int startPole, int endPole,  int intermediatePole) {
        if(n == 0 ) {
            return;
        }
        moveDisks(n - 1, startPole, intermediatePole, endPole );
        System.out.println("Move disk " + n + " from pole " + startPole + " to pole " + endPole);
        moveDisks(n - 1, intermediatePole, endPole, startPole);
    }

    public static void main(String[] args) {
        moveDisks(3,1,3,2);

    }

//    public class TowersOfHanoi {
/*
        public static void move(int n, int startPole, int endPole) {
            if (n== 0){
                return;
            }
            int intermediatePole = 6 - startPole - endPole;
            move(n-1, startPole, intermediatePole);
            System.out.println("Move " +n + " from " + startPole + " to " +endPole);
            move(n-1, intermediatePole, endPole);
        }

        public static void main(String[] args) {
            move(5, 1, 3);
        }


*/
}

