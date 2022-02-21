package Oops.Polymorphism;

public class MainClass {
    public static void main(String[] args) {

//        Dog d = new Dog();
//        Pet p = d;
//
//        Animal a = d;
//
//        d.walk();
//        p.walk();


        // Variable do not override
        Dog d = new Dog();
        Pet p = d;
        System.out.println(d.name);
        System.out.println(p.name);
//    greeting();
//    greeting("Good morning");
//    greeting("good",5);

    }

    public static void greeting(){
        System.out.println("hi....there!");
    }

    public static void greeting(String s){
        System.out.println(s);

    }

    public static void greeting(String s, int count){
        for (int i = 0; i<count ; i++){
            System.out.println(s);
        }

    }

}
