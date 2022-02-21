package Oops.Encapsulation;

public class Person {
    private String name;

    public String getName(){
        return name;
    }
    public  void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Ashu is Unstoppable");
        obj.getName();
        System.out.println(obj.getName());
    }
}
