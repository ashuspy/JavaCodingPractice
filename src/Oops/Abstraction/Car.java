package Oops.Abstraction;

public abstract class Car {
    //Abstract method have no body

    public abstract void accelerate();
    public abstract void brek();

    //abstract class can have non abstract method
    // which is called concrete method

    public void  honk(){
        System.out.println("honking");
    }


}
