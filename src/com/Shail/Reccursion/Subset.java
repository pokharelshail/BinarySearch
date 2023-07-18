package com.Shail.Reccursion;

import java.util.ArrayList;

public class Subset {

    public static void main(String[] args) {
        printSubsets("","abc");
        ArrayList<String> subsetList = subsequence("","abc");
        System.out.println(subsetList);
    }

    private static ArrayList<String> subsequence(String p, String up) {
        if (up.length() ==0){
            ArrayList<String> list= new ArrayList<String>();
            list.add(p);
            return list;
        }
        char firstChar = up.charAt(0);
        ArrayList<String> left =subsequence(p+firstChar,up.substring(1));
        ArrayList<String> right =subsequence(p,up.substring(1));
        left.addAll(right);
        return left;
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
