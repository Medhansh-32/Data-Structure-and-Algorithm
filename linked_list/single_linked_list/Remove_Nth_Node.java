package linked_list.single_linked_list;

public class Remove_Nth_Node {

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

        public  int size(Node head) {
            int count=0;
            Node temp=head;
            while(temp!=null) {
                temp=temp.next;
                count++;
            }
            return count;
        }
        public void removeNthFromEnd(int n) {
            Node temp=head;

            if(n==size(temp)){
                temp=temp.next;
            }
            else {

                n=size(temp)-n+1;

                int count=1;
                Node ptr=head;
                while(count!=n-1) {
                    ptr=ptr.next;
                    count++;
                }
                Node temp1=ptr.next;
                ptr.next=temp1.next;
            }
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

        System.out.println("Before 2nd from end : ");
        list.printList();
        list.removeNthFromEnd(2);
        System.out.println("After 2nd from end : ");
        list.printList();
    }

}
