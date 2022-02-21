package Oops.Encapsulation;

public class Student {

    private  int age ;
     private String name;

     public int getAge(){
         return  age;
     }




    public void  setAge(int age){
         if (age > 20){
             System.out.println("your are too old to be in a nursery school");
         }else

         this.age =age;




     }
}
