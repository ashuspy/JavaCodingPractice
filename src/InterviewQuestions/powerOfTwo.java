package InterviewQuestions;

public class powerOfTwo {
    static boolean isPowerOfTwo(long n){
        if(n==0) return false;
        while (n>0){
            if (n==1) return true;
            if (n%2==0) n/=2;
            else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        if (isPowerOfTwo(31))
        System.out.println("yes");
        else
            System.out.println("No");

        if (isPowerOfTwo(1))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
