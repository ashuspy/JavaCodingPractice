package DSA_Practice.maths;

public class NthNaturalNum {
    public static void main(String[] args) {
        int N = 18976;
        System.out.println(findNthNumber(N));
    }
    static  long findNthNumber(long n){
        long result = 0;
        long p =1;

        while(n>0){
            result += (p*(n%9));
            n=n/9;
            p=p*10;
        }
        return result;
    }

}
