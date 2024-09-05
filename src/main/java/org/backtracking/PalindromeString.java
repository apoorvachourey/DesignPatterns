package org.backtracking;

public class PalindromeString {

    static boolean isPalindrome(int i,String s){


        if(i>=s.length()/2){
            return true;
        }

        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }

        return isPalindrome(i+1,s);

    }
    public static void main(String[] args) {
        String s = "maddam";
        System.out.println(isPalindrome(0,s));
    }
}
