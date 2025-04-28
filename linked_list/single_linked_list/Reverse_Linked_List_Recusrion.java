package linked_list.single_linked_list;

public class Reverse_Linked_List_Recusrion {

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

        Node ans = null;

         private Node rev(Node head) {
            if (head.next == null) {
                ans = head;
                return head;
            }
            rev(head.next).next = head;
            return head;
        }

        public void reverseList() {
            rev(head).next = null;
            head = ans;

        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Before reversing : ");
        list.printList();
        System.out.println("After reversing : ");
        list.reverseList();
        list.printList();
    }

}
