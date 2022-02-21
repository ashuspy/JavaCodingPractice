package Oops.Abstraction;

public class WagonR  extends Car{
    @Override
    public void accelerate() {
        System.out.println("wagonR is accelerating");
    }

    @Override
    public void brek() {
        System.out.println("wagonR is Stopping");
    }
}
