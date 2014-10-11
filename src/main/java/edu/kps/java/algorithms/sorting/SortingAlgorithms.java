package edu.kps.java.algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a>
 * Date: 11/4/13
 * Time: 12:44 PM
 */
public class SortingAlgorithms {
    private long[] a;        // Reference to the array
    private int nElems;     // number of elements in the array.


    public SortingAlgorithms(int nElems) {
        a = new long[nElems];
        nElems = 0;
    }

    public static void main(String[] args) {
        SortingAlgorithms sa = new SortingAlgorithms(25);
        Random random = new Random();

        for(int i = 0 ; i < 25; i++) {
            sa.insert(random.nextInt(100));
        }

        System.out.println("Array before sorting:");
        sa.display();
        sa.insertionSort();
        System.out.println("Array after sorting:");
        sa.display();
    }
    public void insert(long val){
        a[nElems] = val;
        nElems++;
    }

    public void display(){
        StringBuilder sb = new StringBuilder();
        sb.append("Array :[ ");
        for(int i = 0; i < nElems ; i++)
        {
            sb.append(a[i]).append(i < nElems - 1 ? "," : " ");
        }
        sb.append(" ]");
        System.out.println(sb);
    }

    @Override
    public String toString(){
        return "SortingAlgorithms{" +
                "a=" + Arrays.toString(a) +
                ", nElems=" + nElems +
                '}';
    }

    private void swap(int i, int j) {
        long tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void bubbleSort(){
        for(int i = 1; i < nElems; i++){
            for(int j = 0 ; j < nElems - i ; j++){
                if(a[j] > a[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }
    /* The algorithm divides the input list into two parts: the sublist of items already sorted, which is built up
     * from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy
     * the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list.
     * The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the
     * unsorted sublist, exchanging it with the leftmost unsorted element (putting it in sorted order), and moving
     * the sublist boundaries one element to the right.
     */
    public void selectionSort() {
        int min;
        for(int i = 0; i < nElems - 1; i++) {
            min = i;
            for(int j = i; j < nElems; j++ ) {
                if(a[j] < a[min]){
                    min = j;
                }
            }
            swap(i, min);
        }
    }
    /*
     * Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
     * Each iteration, insertion sort removes one element from the input data, finds the location it belongs
     * within the sorted list, and inserts it there. It repeats until no input elements remain.
     *
     * Sorting is typically done in-place, by iterating up the array, growing the sorted list behind it.
     * At each array-position, it checks the value there against the largest value in the sorted list
     * (which happens to be next to it, in the previous array-position checked). If larger, it leaves the element in
     * place and moves to the next. If smaller, it finds the correct position within the sorted list, shifts all the
     * larger values up to make a space, and inserts into that correct position.
     */
    public void insertionSort() {
        for(int i = 1; i < nElems; i++) {
            long cur = a[i];
            int j = i;
            while(j > 0) {
                if(cur <= a[j - 1]){
                    a[j] = a[j - 1];    // Shift the items one to the right.
                }  else {
                    break;
                }
                j--;
            }
            a[j] = cur;
        }
    }

}
