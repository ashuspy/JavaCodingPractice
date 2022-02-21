package Oops.Encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {

        Student obj = new Student();

//        obj.name = "Tom";
//        obj.age = 56;
        obj.setAge(11);
        System.out.println(obj.getAge());

    }
}