package com.Shail.Reccursion;

import java.util.Arrays;

public class PatternProblems {
    public static void main(String[] args) {
        printRevTraingle(5,0);
        printTriangle(5,0);
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(arr,0, arr.length-1)));
    }

    /*
    If n is 5

     * * * * *
     * * * *
     * * *
     * *
     *
     */
    static void printRevTraingle(int n, int limit){
        if (n==0){
            System.out.print("* ");
            return;
        }
        if (limit == n){
            System.out.println();
            printRevTraingle(n-1,0);
        }else {
            System.out.print("* ");
            printRevTraingle(n, limit + 1);
        }
    }

    static  void printTriangle(int n, int limit){
        if (n==1){
            return;
        }
        if (limit == n){
            printTriangle(n-1,0);
            System.out.println();
        }else {
            printTriangle(n, limit + 1);
            System.out.print("* ");
        }
    }

    /* Add more parameters as needed*/
    static int[] bubbleSort(int[] arr, int index, int stop){
        if (stop ==0){
            return arr;
        }
        if (index == stop){
           return bubbleSort(arr, 0, stop-1);
        }else{
            if (arr[index] > arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            return bubbleSort(arr, index+1 ,stop);
        }
    }

    /* Add more parameters as needed*/
    static int[] selectionSort(int[] arr){
        return arr;
    }
}
