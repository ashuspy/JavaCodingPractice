package Maths;

import java.util.Arrays;

public class PrimeNUm {
    public static void main(String[] args) {
          boolean isPrime[] = seiveOfEratoSthness(20 );
          for (int i=0 ; i<=20; i++)
          {
              System.out.println(i + " " + isPrime[i]);
          }
//        System.out.println(gcd(24,60));
//        System.out.println(fastPower(34555556,6,1000000007));
    }
    static int gcd(int a, int b){
//        if(b==0) return a;
//        return gcd(b, a%b);
        return a%b == 0 ? b : gcd(b, a%b);
    }

    static long fastPower(long a, long b, int n){
        long res = 1;
        while(b>0){
            if ((b%2) != 0){
                res = (res * a % n) % n;
            }
            a= (a%n * a%n) %n;
            b= b>>1; // same as // b= b/2;
        }
        return res;
    }


    static boolean[] seiveOfEratoSthness(int n){
        boolean isprime[] = new boolean[n+1];
        Arrays.fill(isprime, true);
        isprime[0] = false;
        isprime[1] = false;
        for (int i =2; i*i <= n; i++){

            for (int j = 2*1; j<=n; j+=i){
                isprime[j] = false;

            }
        }
        return isprime;
    }
}
