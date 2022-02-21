package InterviewQuestions;


import java.util.LinkedList;

public class MyLinkedList {
    static Node head;// head of list

    static  class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next =null;
        }
    }
    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

   public void printList(Node node){
        while(node!= null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);

        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked List ");
        list.printList(head);
    }

}
