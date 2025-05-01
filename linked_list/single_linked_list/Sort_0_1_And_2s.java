package linked_list.single_linked_list;

public class Sort_0_1_And_2s {

    static class LinkedList<T extends Integer> {
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

        public int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public void sort_0_1_2s() {
            if (head == null || head.next == null) {
                return;
            }


            int count0 = 0, count1 = 0, count2 = 0;
            Node current = head;

            while (current != null) {
                if (current.data.equals(0)) {
                    count0++;
                } else if (current.data.equals(1)) {
                    count1++;
                } else if (current.data.equals(2)) {
                    count2++;
                }
                current = current.next;
            }


            current = head;


            while (count0 > 0) {
                current.data = (T) Integer.valueOf(0);
                current = current.next;
                count0--;
            }


            while (count1 > 0) {
                current.data = (T) Integer.valueOf(1);
                current = current.next;
                count1--;
            }


            while (count2 > 0) {
                current.data = (T) Integer.valueOf(2);
                current = current.next;
                count2--;
            }
        }


        public void sort_0_1_2s_alternative() {
            if (head == null || head.next == null) {
                return;
            }


            Node zeroHead = new Node(null);
            Node oneHead = new Node(null);
            Node twoHead = new Node(null);


            Node zeroTail = zeroHead;
            Node oneTail = oneHead;
            Node twoTail = twoHead;


            Node current = head;
            while (current != null) {
                if (current.data.equals(0)) {
                    zeroTail.next = new Node(current.data);
                    zeroTail = zeroTail.next;
                } else if (current.data.equals(1)) {
                    oneTail.next = new Node(current.data);
                    oneTail = oneTail.next;
                } else if (current.data.equals(2)) {
                    twoTail.next = new Node(current.data);
                    twoTail = twoTail.next;
                }
                current = current.next;
            }


            head = zeroHead.next;


            if (head == null) {
                head = oneHead.next;
            } else {
                zeroTail.next = oneHead.next;
            }


            if (head == null) {
                head = twoHead.next;
            } else if (oneHead.next == null) {

                zeroTail.next = twoHead.next;
            } else {

                oneTail.next = twoHead.next;
            }


            current = head;
            while (current != null && current.next != null) {
                current = current.next;
            }
            tail = current;

            if (tail != null) {
                tail.next = null;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(1);

        System.out.println("Original list:");
        list.printList();

        list.sort_0_1_2s();

        System.out.println("Sorted list:");
        list.printList();


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(0);
        list2.add(1);
        list2.add(0);
        list2.add(2);
        list2.add(1);

        System.out.println("\nOriginal list 2:");
        list2.printList();

        list2.sort_0_1_2s_alternative();

        System.out.println("Sorted list 2 (alternative method):");
        list2.printList();
    }
}