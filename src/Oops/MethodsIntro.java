package Oops;

public class MethodsIntro {
    public static void main(String[] args) {
     int firstNum = 34;
     int secondNum = 23;

     int result = maxOf(firstNum,secondNum);

        System.out.println(maxOf(100,200));
        maxOf(9,1111111);
        System.out.println(result);

        sayHi();
    }

    static int maxOf(int a, int b){
//        if(a>b){
//            return a;
//        }else
//            return b;
        return a>b ? a:b;
    }

    static void sayHi(){
        System.out.println("hi ");
        System.out.println("Good Morning");
    }
}
