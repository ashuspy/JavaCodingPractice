package WhileLoop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp= n;
        int sum = 0;

        while (temp>0){
            int lastdigit = temp % 10;
            temp /=10;
            sum +=lastdigit;
            System.out.println(lastdigit + "  " + temp + "  " + sum);
        }
        System.out.println("Sum of the digits of " + n + " is " + sum);

//       int numOfDigits = (int) Math.log10(n) + 1;
//        System.out.println(numOfDigits);
    }
}
