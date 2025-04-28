package linked_list.single_linked_list;


public class Starting_Point_Of_Cycle {
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

        public Node detectCycle(Node head) {

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {

                    slow = head;
                    while (slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow;
                }
            }

            return null;
        }

    }

    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();

        LinkedList<Integer>.Node head = list.new Node(0);
        LinkedList<Integer>.Node node1 = list.new Node(1);
        LinkedList<Integer>.Node node2 = list.new Node(2);
        LinkedList<Integer>.Node node3 = list.new Node(1);
        LinkedList<Integer>.Node node4 = list.new Node(4);
        LinkedList<Integer>.Node node5 = list.new Node(5);


        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        System.out.println("Node : "+list.detectCycle(head) +" is starting point of Cycle");
    }


}
