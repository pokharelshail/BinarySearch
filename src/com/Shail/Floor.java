package com.Shail;

public class Floor {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index: greatest number <= target
    static int floor(int[] arr, int target) {
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
        return high; // Since low will be greater than high and one past the closest num to target if nothing found
    }
}

