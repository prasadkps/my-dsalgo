package edu.kps.java;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * @date 10/28/13
 */
public class OrderedArray
{
    private long[] data = new long[100];

    public int find(long searchKey) {

        return -1;
    }

    public static void main(String[] args)
    {
        OrderedArray arr = new OrderedArray();
        int pos = arr.find(25L);
        System.out.println("Position where found : " + pos);
    }
}
