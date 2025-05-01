package linked_list.single_linked_list;

public class Sort_List {

    static class LinkedList<T extends Comparable<T>> {  // Restrict T to types that implement Comparable

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

        public Node mid(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public Node sort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node mid = mid(head);
            Node righthead = mid.next;
            mid.next = null;

            Node lefthead = sort(head);
            righthead = sort(righthead);
            return merge(lefthead, righthead);
        }

        public Node merge(Node lefthead, Node righthead) {
            Node dummy = new Node(null);
            Node temp = dummy;

            while (lefthead != null && righthead != null) {
                // Use compareTo method instead of <= operator
                if (lefthead.data.compareTo(righthead.data) <= 0) {
                    temp.next = lefthead;
                    lefthead = lefthead.next;
                } else {
                    temp.next = righthead;
                    righthead = righthead.next;
                }
                temp = temp.next;
            }

            if (lefthead != null) {
                temp.next = lefthead;
            } else {
                temp.next = righthead;
            }

            return dummy.next;
        }

        public void sortList() {
            head = sort(head);
        }

    }

    public static void main(String[] args) {
        // Example with Integer
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(4);
        intList.add(2);
        intList.add(1);
        intList.add(3);

        System.out.println("Original Integer List:");
        intList.printList();

        intList.sortList();

        System.out.println("Sorted Integer List:");
        intList.printList();

        // Example with String
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("cherry");
        stringList.add("date");

        System.out.println("\nOriginal String List:");
        stringList.printList();

        stringList.sortList();

        System.out.println("Sorted String List:");
        stringList.printList();
    }
}