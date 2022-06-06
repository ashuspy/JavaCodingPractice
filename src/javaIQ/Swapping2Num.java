package javaIQ;

public class Swapping2Num {
    public static void main(String[] args) {
        int a =10;
        int b= 20;
        System.out.println("before swapping " + a + " "+ b);
        //1st logic
        int temp = a;
        a = b;
        b= temp;
        System.out.println("After swapping " + a+ " "+ b);
        //2nd logic
//         a = a+b;//10+20=30
//         b = a-b;//30-20=10
//         a = a-b;//30-10=20

        // 3rd logic
//        a= a*b;
//        b=a/b;
//        a=a/b;



    }
}
