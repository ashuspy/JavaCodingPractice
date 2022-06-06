package Arrays;

import java.util.*;

import java.math.BigInteger;

public class SmallFactorial{

    static BigInteger factorial(int N){

        BigInteger f

            = new BigInteger("1");

        for (int i = 2; i <= N; i++)

            f = f.multiply(BigInteger.valueOf(i));

        return f;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i<T; i++){

            int ele = sc.nextInt();

            System.out.println(factorial(ele));

        }

        sc.close();

    }

}
