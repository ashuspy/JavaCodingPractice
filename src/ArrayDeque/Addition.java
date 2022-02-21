package ArrayDeque;
// Java program to Illustrate Addition of elements
// in ArrayDeque

import java.util.ArrayDeque;
import java.util.Deque;

public class Addition {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
         dq.add("The");
         dq.addFirst("To");
         dq.addLast("Geeks");
        System.out.println(dq);

         dq.offer("For");
         dq.offerFirst("Welcome");
         dq.offerLast("Geeks");
        System.out.println(dq);
    }
}
