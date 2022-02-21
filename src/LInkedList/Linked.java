package LInkedList;

class Node {
    Node next;
    int data;
}
class Link {
    public Node insertNodeInMid(Node node, int val) {
        if (node == null) {
            return node;
        }
        Node slow, fast, head;
        slow = fast = head = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newNode = getNewNode(val);
        newNode.next = slow.next;
        slow.next = newNode;
        return head;
    }

    public Node getNewNode(int key) {
        Node a = new Node();
        a.next = null;
        a.data = key;
        return a;
    }

    public Node insert(int key, Node node) {

        if (node == null)
            return getNewNode(key);
        else
            node.next = insert(key, node.next);

        return node;
    }

    public void printList(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        printList(node.next);
    }


}

public class Linked {
    public static void main(String[] args) {
        Link a = new Link();
        Node head = null;
        head = a.insert(12, head);
        head = a.insert(7, head);
        head = a.insert(13, head);
        head = a.insert(22, head);
        head = a.insert(8, head);

        a.printList(head);
        System.out.println();

        head = a.insertNodeInMid(head,100);
        a.printList(head);
    }
}

