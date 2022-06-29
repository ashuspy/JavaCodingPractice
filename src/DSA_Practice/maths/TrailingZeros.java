package DSA_Practice.maths;

public class TrailingZeros {
    static int findTrailingZeroes(int n){
        if(n<0)
            return -1;
        int count = 0;

        for (int i=5; n/i>=1; i*=5)
            count += n/i;

        return count;
    }
    public static void main(String[] args) {
        int n =100;
        System.out.println("Count of trailing zeroes in "
                + n + "! is " + findTrailingZeroes(n));
    }
}
