package PriorityQueues;

import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Apple");
        pq.add("kiwi");
        pq.add("mango");
        pq.add("Banana");

        System.out.println(pq);
        System.out.println(pq.element());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

    }
}
