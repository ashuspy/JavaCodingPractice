package Sets;

//import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {

//        Set<String> fruits = new HashSet<>();
//
//        fruits.add("Apple");
//        fruits.add("Banana");
//
//        System.out.println(fruits.add("Banana"));
//        System.out.println(fruits.add("Kiwi"));
//
//        System.out.println(fruits);

        Set<Integer> x = new HashSet<>();
        x.add(23);
        x.add(1);
        x.add(6);

        Set<Integer> y = new HashSet<>();
//        y.add(3);
        y.add(1);
//        y.add(16);

//        x.addAll(y);//union
//        x.retainAll(y);//intersection

        System.out.println(x.containsAll(y));
    }
}
