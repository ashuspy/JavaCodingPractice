package InterviewQuestions;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(19));

        int N =100;
        for(int i =1;i<=N;i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }

    public  static boolean isPrime(int n){
        if ( n == 0 || n==1){
            return  false;
        }
        if (n==2){
            return true;
        }
        for (int i = 2; i<=n/2; i++){ //That lower and upper bound is about performance i.e.,
                                      // reducing the number of iterations that you need to compute.
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
