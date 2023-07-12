package com.Shail;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target) {
        int low =0;
        int high = arr.length-1;
        while (low <= high){
            int mid = (low + (high-low)/2);

            if(target > arr[mid]){
                low = mid+1;
            }else if (target < arr[mid]){
                high = mid -1;
            }else{
                return mid;
            }
        }
        return low; // Since low will be greater than high and one past the closest num to target if nothing found
    }

}
