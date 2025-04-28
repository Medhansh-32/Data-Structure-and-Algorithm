package linked_list.single_linked_list;

public class Middle_Linked_List {

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

        public Node middleNode() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        System.out.println("Middle node : "+list.middleNode().data);
    }

}