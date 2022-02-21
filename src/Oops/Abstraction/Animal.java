package Oops.Abstraction;

abstract class Animal {

   abstract void animalSound();

   void sleep(){
       System.out.println("Zzzzzzz");
   }
}

class Lion extends Animal{

    @Override
    void animalSound() {
        System.out.println("Lion Roars..... ");
    }
}
class Main{
    public static void main(String[] args) {
        Lion cub = new Lion();
        cub.animalSound();
        cub.sleep();
    }
}
