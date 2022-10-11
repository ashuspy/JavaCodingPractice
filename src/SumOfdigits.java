import java.util.Scanner;

public class SumOfdigits {
   /* static int getSum(int n)
    {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;

    }
    public static void main(String[] args) {
               int n = 12345;;
        System.out.println(getSum(n)); */
   public static void main(String[] args) {

        int num, digit,sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
         num = sc.nextInt();
         while (num > 0){
             digit = num%10;// this '%' will give the right most digit
             sum = sum + digit; //0+Digit
             num = num/10; // this '/' will give remove the rightmost digit

         }
        System.out.println("Sum of Digits :" + sum);
         if (sum%2 == 0 || sum%3==0){
             System.out.println("Sum is not Prime");
         }else System.out.println("Sum is prime");
    }
}
