package linked_list.single_linked_list;

public class Delete_Middle_Node {

    static class LinkedList<T> {


        private Node head = null;

        private Node tail = null;

        class Node {
            T data;
            Node next;

            public Node(T data) {
                this.data = data;
            }

        }

        public void add(T data) {
            Node node = new Node(data);
            if (head == null && tail == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        public void printList() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public void midNode(Node head){
            Node fast=head;
            Node slow=head;
            Node prev=null;

            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                prev=slow;
                slow=slow.next;
            }
            prev.next=slow.next;

        }
        public void deleteMiddle() {
            Node temp = head;
            if(temp.next==null) {
                System.out.println("null");
            }
            midNode(head);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Before deleting middle node : ");
        list.printList();
        list.deleteMiddle();
        System.out.println("\nAfter deleting middle node : ");
        list.printList();
    }
}
