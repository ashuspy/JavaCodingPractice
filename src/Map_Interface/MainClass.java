package Map_Interface;
import java.util.*;
import java.util.Map.Entry;

public class MainClass {
    public static void main(String[] args) {

//        Map<String, Integer> numbers = new HashMap<>();
//
//        numbers.put("one" , 1);
//        numbers.put("Two" , 2);
//        numbers.put("Six" , 6);
//        numbers.put("Seven" , 7);
//
//        numbers.put("one" , 10);// it updates
//        numbers.remove("Two");
//
//        System.out.println(numbers);
//        System.out.println(numbers.get("Two"));
//        System.out.println(numbers.containsKey("one"));
//        System.out.println(numbers.keySet());
//        System.out.println(numbers.entrySet());
//
//        Set<Entry<String, Integer>> entries = numbers.entrySet();
//
//        for(Entry<String, Integer> entry :  numbers.entrySet()) {
//
//            entry.setValue(entry.getValue() *100);
//        }
//        System.out.println(numbers);

        System.out.println(getHash("CAT"));
        System.out.println(getHash("Dog"));
        System.out.println(getHash("BALL"));
    }

    public static int getHash(String s) {
        int hash =0 ;
        for (int i= 0 ; i<s.length(); i++){
            hash += s.charAt(i);
        }
        return  hash;
    }
}
