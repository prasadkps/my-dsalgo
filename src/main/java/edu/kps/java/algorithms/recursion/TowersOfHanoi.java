package edu.kps.java.algorithms.recursion;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/7/13
 * Time: 12:29 PM
 */
public class TowersOfHanoi {

    public static void doTowersOfHanoi(int numDisks, char from, char inter, char to) {
        System.out.println(String.format("Disks (%d): from=%S, inter=%c, to=%c",numDisks, from, inter, to));
        if(numDisks  == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            doTowersOfHanoi(numDisks - 1, from, to, inter);
            System.out.println("Disk " + numDisks + " from " + from + " to " + to);
            doTowersOfHanoi(numDisks - 1, inter, from, to);
        }
    }

    public static void main(String[] args)
    {
        doTowersOfHanoi(3, 'A', 'B', 'C');
    }
}
