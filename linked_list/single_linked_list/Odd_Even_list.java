package linked_list.single_linked_list;

public class Odd_Even_list {

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

        public void oddEvenList() {
            if (head == null) {
                System.out.println("null");
            }
            Node temp = head;
            Node even = head.next;
            int i = 0;
            Node evenNode = head.next;
            while (even != null && even.next != null) {

                temp.next = even.next;
                temp = even.next;
                even.next = temp.next;
                even = temp.next;

            }
            temp.next = evenNode;
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

        System.out.println("List Before transformation : ");
        list.printList();

        list.oddEvenList();
        System.out.println("List After transformation : ");
        list.printList();


    }

}
