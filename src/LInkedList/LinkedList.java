package LInkedList;

public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;

       public Node(int data){
           this.data = data;
           next = null;
       }
    }

    void add(int data){
        Node toAdd = new Node(data);

        if(isEmpty()){
            head = toAdd;
            return;
        }
         Node temp = head;
         while(temp.next != null){
             temp = temp.next;
         }
        temp.next = toAdd;
    }

    boolean isEmpty(){
        return head == null;
    }

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        LinkedList myLL = new LinkedList();

        for (int i = 0; i<10; i++){
            myLL.add(i);
        }
        myLL.printList();
    }

//    public static class  MainLinkedList{
//        public static void main(String[] args) {
//            LinkedList myLL = new LinkedList();
//            myLL.add(12);
//            myLL.add(56);
//            myLL.printList();
//        }
//    }
}

