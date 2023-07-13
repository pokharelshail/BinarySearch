package com.Shail.Reccursion;

import java.util.Arrays;

public class PatternProblems {
    public static void main(String[] args) {
        printRevTraingle(5,0);
        printTriangle(5,0);
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(arr,0, arr.length-1)));
        int[] arr2 = {4,3,2,1};
        System.out.println(Arrays.toString(selectionSort(arr, arr.length-1,0,0)));
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


    static int[] selectionSort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return arr ;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
               return selectionSort(arr, r, c+1, c);
            } else {
                return selectionSort(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            return selectionSort(arr, r-1, 0, 0);
        }
    }



    /* Add more parameters as needed*/
//    static int[] selectionSort(int[] arr,int end,int start, int max){
//       if (end ==0){
//           return arr;
//       }
//
//       if (start< end) {
//           if (arr[start] > arr[max]) {
//              return selectionSort(arr, end, start + 1, start);
//           } else {
//               return selectionSort(arr, end, start + 1, max);
//           }
//       }else{
//           int temp = arr[max];
//           arr[max] = arr[end];
//           arr[end] = temp;
//          return selectionSort(arr,end-1,0,0);
//       }
//    }
}
