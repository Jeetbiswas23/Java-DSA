package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public static void addFirst(int data) { //Time Complexity is constant O(1)
        //Create new Node
        Node nb = new Node(data);
        if (Head == null) {
            Head = Tail = nb;
        }
        //new node next=head
        nb.next = Head;//This is Linking 

        //head=new node
        Head = nb;

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);

    }
    
}
