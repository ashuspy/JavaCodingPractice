package Oops;
import Oops.A.*;
public class StaticKeyword {

 static {
     System.out.println("block 1");
 }

 static {
     System.out.println("block 2");
 }
    public static void main(String[] args) {

//        System.out.println(Math.max(23,24));
//         A objA = new A();
//         B objB = objA.new B();
//
//         C objC = new A.C();

        System.out.println("main");
    }
    static {
        System.out.println("block 3");
    }
}
