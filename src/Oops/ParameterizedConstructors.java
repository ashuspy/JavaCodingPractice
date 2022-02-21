package Oops;

class Vehicle1 {
    int wheels;
    int headlights;
    String color;

     Vehicle1(){

     }
    Vehicle1(int wheels){
        this.wheels = wheels;
        headlights=2;
    }

    Vehicle1(int wheels,String color){
        this.wheels =wheels;
        this.color = color;
        headlights =2 ;
    }
}

public class ParameterizedConstructors {
    public static void main(String[] args) {
        Vehicle1 car = new Vehicle1(4);
        Vehicle1 scooty = new Vehicle1(2);

        Vehicle1 eRikshaw = new Vehicle1(3,"yellow");

        Vehicle1 random = new Vehicle1();
        System.out.println(scooty.wheels+ " wheels");
        System.out.println(eRikshaw.wheels+ " wheels "
                          + eRikshaw.color+ " color");

    }
}
