package com.Shail.Reccursion;

public class Subset {

    public static void main(String[] args) {
        printSubsets("","abc");
    }

    private static void printSubsets(String p, String up) {
        if (up.length() ==0){
            System.out.println(p);
            return;
        }
        char s = up.charAt(0);
        printSubsets(p,up.substring(1));
        printSubsets(p+s,up.substring(1));

    }
}
