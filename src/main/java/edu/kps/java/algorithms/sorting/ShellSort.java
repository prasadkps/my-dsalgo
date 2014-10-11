package edu.kps.java.algorithms.sorting;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/7/13
 * Time: 8:05 PM
 */

public class ShellSort
{
    private long[] theArray; // ref to array theArray
    private int nElems; // number of data items

    public ShellSort(int max)
    {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value)
    {
        theArray[nElems] = value;
        nElems++;
    }

    public void display() // displays array contents
    {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) // for each element,
            System.out.print(theArray[j] + " "); // display it
        System.out.println("");
    }

    public void shellSort()
    {

        int outer;
        int inner;
        long temp;
        int h = 1;

        while (h <= nElems / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            // find initial value of h // (1, 4, 13, 40, 121, ...) // decreasing h, until h=1
            // h-sort the file
            for (outer = h; outer < nElems; outer++) {
                temp = theArray[outer];
                inner = outer;
                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            } // end for
            h = (h - 1) / 3;
        }
    }
    // end while(h>0) } // end shellSort()

    public static void main(String[] args)
    {
        int maxSize = 10;
        ShellSort arr;
        arr = new ShellSort(maxSize);
        for (int j = 0; j < maxSize; j++) {
            long n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }
        arr.display();
        arr.shellSort();
        arr.display();
    } // end main()
} // end class ShellSort