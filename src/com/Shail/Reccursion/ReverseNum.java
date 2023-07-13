package com.Shail.Reccursion;

import java.sql.SQLOutput;

public class ReverseNum {

    static int sum =0;
    public static void main(String[] args) {
        reverseNum(1234);
        System.out.println(sum);
        System.out.println(revNum(1234));

    }

    static void reverseNum(int n){
        if (n ==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverseNum(n/10);
    }

    static int revNum(int n){
        if (n ==0){
            return 0;
        }
        int num_digits = (int) (Math.log10(n))+1;
        int rem = (int) (n%10 * Math.pow(10,num_digits-1));
        System.out.println(rem);
        return rem + revNum(n/10);
    }
}
