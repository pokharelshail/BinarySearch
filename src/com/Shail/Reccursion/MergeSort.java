package com.Shail.Reccursion;


import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        int[] newArr = mergeSort(arr);
        System.out.println(Arrays.toString(newArr));
    }

    static int[] mergeSort(int[] arr){
        if (arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] leftSort = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] rightSort = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(leftSort,rightSort);
    }

    private static int[] merge(int[] leftSort, int[] rightSort) {
        int[] result = new int[leftSort.length + rightSort.length];
        int i =0;
        int j =0;
        int k =0;

        while(i < leftSort.length && j < rightSort.length){
            result[k]=leftSort[i] <rightSort[j] ? leftSort[i++] : rightSort[j++];
            k++;
        }
        while(i < leftSort.length){
            result[k] =leftSort[i++];
            k++;
        }
        while(j < rightSort.length){
            result[k] =rightSort[j++];
            k++;
        }
        return result;
    }
}
