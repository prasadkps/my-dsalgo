package edu.kps.java.algorithms.sorting;

import edu.kps.java.util.CommonUtils;

import java.util.Random;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a><br/>
 * Date: 11/7/13
 * Time: 8:06 PM
 */
public class QuickSort
{
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[]a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean isSorted(Comparable[] a) {
        for(int i = 1; i < a.length; i++) {
            if(less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi+1;
        Comparable v = a[lo];
        while(true) {
            while(less(a[++i], v)) {
                if (i == hi) break;
            }
            while(less(v, a[--j])) {
                if(j == lo) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[]a, int lo, int hi){
        if(hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public static Comparable[] getRandomInput(int size, int bound) {
        Random random = new Random();
        Comparable[] input = new Comparable[size];
        for(int i = 0; i < size; i++) {
            input[i] = random.nextInt(bound);
        }
        return input;
    }

    public static void display(Comparable[] arr, String prefix) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(" Array = [ ");
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(i < arr.length - 1? ",":" ]");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Comparable[] a = getRandomInput(15, 100);
        a = new Comparable[15];
        a[0] = 100.0;
        a[1] = 32.0;
        a[2] = -15.0;
        a[3] = 23.0;
        a[4] = -45.0;
        a[5] = -96.0;
        a[6] = -1.5;
        a[7] = 5.4;
        a[8] = -6.3;
        a[9] = 45.0;
        a[10] = 96.0;
        a[11] = 69.0;
        a[12] = 1.0;
        a[13] = 45.67;
        a[14] = 55.0;

        display(a, "Before Sorting");
        sort(a);
        display(a, "After Sorting");

    }




}
