package Oops;

class Vehicle{
    int wheels;

    Vehicle(){
      wheels =4;
    }
}

public class MyConstructor {

    MyConstructor(){
        System.out.println("Object is now created");
    }
    public static void main(String[] args) {
//       MyConstructor obj = new MyConstructor();

        Vehicle car = new Vehicle();
        Vehicle car2 = new Vehicle();
        System.out.println(car2.wheels+ " wheels");
    }
}

