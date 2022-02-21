package WhileLoop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        int reverseNum = 0;

        while(temp>0){
            int lastdigit = temp %10;
            reverseNum = reverseNum * 10 + lastdigit;
            temp /=10;
        }

        if (reverseNum == n) {
            System.out.println(n + " is Palindrome");
        }else{
            System.out.println(n + " is not Palindrome");
        }


    }

}
