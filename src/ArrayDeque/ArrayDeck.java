package ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDeck {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

//        ad.addFirst(12);
//        ad.addFirst(23);
//
//        ad.pop();
//        System.out.println(ad.peek());

        ad.push(12);
        ad.push(23);
        ad.push(25);

        System.out.println(ad.pop());
        System.out.println(ad.pop());

    }
}
