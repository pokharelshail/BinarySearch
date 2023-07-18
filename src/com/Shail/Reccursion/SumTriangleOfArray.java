package com.Shail.Reccursion;

import java.sql.Array;
import java.util.Arrays;

public class SumTriangleOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printSumofArray(arr);

    }
    /**Given an array of integers, print a sum triangle from it such that the first level has
     * all array elements. From then,at each level number of elements is one less than the previous
     * level and elements at the level is be the Sum ofconsecutive two elements in the previous level.
     * */
    private static void printSumofArray(int[] arr) {
        if(arr.length ==1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[]copy = new int[arr.length-1];
        for (int i=0; i < arr.length-1; i++){
            copy[i] = arr[i] + arr[i+1];
        }
        printSumofArray(copy);
        System.out.println(Arrays.toString(arr));
    }



}
