package javaIQ;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String str;
        System.out.println("enter string: ");
        Scanner sc = new Scanner(System.in);
        str =sc.next();
        String rev = "";
        int len = str.length();
        for (int i =len-1; i>=0; i-- ){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(rev +" is Palinrome");
        }else
            System.out.println(rev + " is not palindrome");
    }
}
