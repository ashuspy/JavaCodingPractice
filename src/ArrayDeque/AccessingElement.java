package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AccessingElement {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.add("Welcome");
        dq.add("2");
        dq.add("my");
        dq.add("kingdom");
        dq.add("Freind");

        System.out.println(dq);
        System.out.println("Get the first element : " + dq.getFirst());
        System.out.println( "Get the last element : " +dq.getLast());
    }
}
