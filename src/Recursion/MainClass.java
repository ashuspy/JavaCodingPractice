package Recursion;
//Find sum of 1st N natural Numbers using Recursion
public class MainClass {
    static int stepCount = 0;
    public static void main(String[] args) {
//        System.out.println(sum(5));

//        System.out.println(pow(3,10000));
//        System.out.println("steps " + stepCount);
//
//        stepCount = 0;
//        System.out.println(fastPow(3,10000));
//        System.out.println("steps " + stepCount);

        System.out.println(path(200,1));
    }

    static int sum(int n) {
        if (n==1){            //BASE CASE
            return 1;
        }
        return  n + sum(n-1);   //Recursive Call
    }
//Calculate power using recursion a^b.+Fast Power
     static int pow(int a, int b) {
        stepCount++;
        if(b==0){
            return 1;
        }
        return a * pow(a,b-1);
     }

     static int fastPow(int a, int b) {
         System.out.println(b);
         stepCount++;
         if(b==0){
             return 1;
         }
         if (b%2==0){ //if b iseven
             return fastPow(a*a, b/2);
         }
         return a*fastPow(a, b-1); //if b is odd
     }

//Find all the paths in nxm matrix
    static int path(int n, int m) {
        if (n == 1 || m == 1) return  1;
        return path(n, m-1) +path(m, n-1);
    }
}
