package Oops.Abstraction;

public class Audi extends Car {
    @Override
    public void accelerate() {
        System.out.println("Audi is accelerating");
    }

    @Override
    public void brek() {
        System.out.println("audi is stopping");
    }
}
