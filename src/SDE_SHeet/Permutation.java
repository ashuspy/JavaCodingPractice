package SDE_SHeet;

import java.util.Scanner;
//Time Complexity O(n*n!)

public class Permutation {
    static void permute(String str , String answer){
        if(str.length() == 0){
            System.out.println(answer + " ");
            return;
        }

        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            String left_substr = str.substring(0,i);
            String right_substr = str.substring(i+1);
            String rest = left_substr + right_substr;
            permute(rest,answer+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s ;
        String answer = "";

        System.out.print("Enter the String : ");
        s= sc.next();

        System.out.println("all possible Strings are : ");
        permute(s,answer);

    }
}
