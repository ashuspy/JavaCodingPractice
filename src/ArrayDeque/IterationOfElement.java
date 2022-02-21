package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class IterationOfElement {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
         dq.add("For");
         dq.addFirst("Geeks");
         dq.addLast("Geeks");
         dq.add("is so Good");

         for(Iterator itr = dq.iterator(); itr.hasNext();) {

         }

    }
}
