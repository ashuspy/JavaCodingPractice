package InterviewQuestions;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              long  n= (long) sc.nextDouble();
        System.out.println(factorial(n));
    }
    public  static  long factorial(long n){
        if(n==1){
            return 1;
        }else
            return (n * factorial(n-1));
    }
}
