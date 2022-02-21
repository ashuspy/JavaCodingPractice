package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s = "12345654321";
        if (ispalind(s))
            System.out.println("yes");
        else
            System.out.println("NO");
    }

    static boolean isPalindrome(String s, int l, int r){
        if(l>=r){
            return true;
        }
        if (s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalindrome(s,l+1, r-1);
    }
    static boolean ispalind(String s){
        int n = s.length();
        if(n==0){
            return  true;
        }
        return  isPalindrome(s,0,n-1);
    }
}
