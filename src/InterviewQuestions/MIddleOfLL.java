package InterviewQuestions;

public class MIddleOfLL {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    void getMiddle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;
        }
        System.out.println("The middle element is [" +slow.data + "] \n");
//        return slow.data;
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList(){
        Node tnode = head;
        while (tnode !=  null){
            System.out.print(tnode.data+"->");
            tnode= tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        MIddleOfLL ml = new MIddleOfLL();
        for (int i =6; i>0; --i){
            ml.push(i);
            ml.printList();
            ml.getMiddle();
        }
    }

}
