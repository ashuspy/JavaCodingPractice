package InterviewQuestions;

public class Swap2NumWithoutUsing3num {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        b = b + a; // now b is sum of both the numbers
        a = b - a; // b - a = (b + a) - a = b (a is swapped)
        b = b - a; // (b + a) - b = a (b is swapped)

        System.out.println("a= " + a + " b= " + b);
    }
}
//        swapNumber(a,b);
//        System.out.printf("a is %d, b is %d",a,b );
        // a is 10, b is 20


//    public  static void swapNumber(int a, int b){
//        b = b + a; // now b is sum of both the numbers
//        a = b - a; // b - a = (b + a) - a = b (a is swapped)
//        b = b - a; // (b + a) - b = a (b is swapped)
//    }


