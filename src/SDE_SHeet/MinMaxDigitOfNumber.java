package SDE_SHeet;

public class MinMaxDigitOfNumber {
    static private void MinMax(int n){
        int d;
        int min = Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(n != 0)
        {
            d= n%10;
            min = Math.min(min,d);
            max = Math.max(max,d);
            n = n/10;
        }
        System.out.println("the minimum number is: " + min);
        System.out.println("the maximum number is :  " + max);
    }
    public static void main(String[] args) {
        int n = 4726;
        MinMax(n);
    }
}
