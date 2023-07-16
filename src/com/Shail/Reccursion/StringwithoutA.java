package com.Shail.Reccursion;

/** given a string return a string without a'*/
public class StringwithoutA {
    public static void main(String[] args) {

        String test = "aaamuiimaaach";
        System.out.println(removeString(test));
    }

    private static String removeString(String word){
        if (word.length() ==1){
            String ans = word.charAt(0) != 'a'? String.valueOf(word.charAt(0)): "";
            return ans;
        }
        String newStr =  word.charAt(0) != 'a'? String.valueOf(word.charAt(0)): "";
        return newStr + removeString(word.substring(1));
    }

    private static String removeString2(String test, int ind,String ans) {
        if (ind==test.length()){
            return ans;
        }
        if (test.charAt(ind)!= 'a'){
            ans += test.charAt(ind);
        }
        return removeString2(test,ind+1,ans);

    }
}
