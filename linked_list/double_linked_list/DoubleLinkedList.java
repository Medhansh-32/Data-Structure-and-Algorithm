package linked_list.double_linked_list;

public class DoubleLinkedList<Integer> {

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = null;
            head.prev = null;
            tail = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
        }
        size++;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


}
