package ArrayDeque;

import java.util.ArrayDeque;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.addFirst(2);
        dq.addLast(3);

       System.out.println(dq);

        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq.poll());




    }
}
