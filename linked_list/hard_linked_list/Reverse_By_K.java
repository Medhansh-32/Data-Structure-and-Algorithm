package linked_list.hard_linked_list;

public class Reverse_By_K extends LinkedList<Integer>{
    public Node reverse(Node curr) {
        Node next = null;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public void reverseKGroup(int k) {

        int size = 0;
        Node temp = getHead();
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int j = 1;
        Node next = null;
        temp = getHead();
        Node nextNode = temp;
        Node prevNode = null;
        Node ans = null;
        Node end = null;
        Node start = null;

        for (int i = 0; i < size / k; i++) {

            Node curr = nextNode;

            j = 1;
            while (j <= k - 1) {

                temp = temp.next;
                j++;

            }

            nextNode = temp.next;

            temp.next = null;

            start = reverse(curr);

            end = curr;
            if (prevNode != null)
                prevNode.next = start;
            prevNode = end;

            if (i == 0) {
                ans = start;
            }
            temp = nextNode;
        }
        end.next = nextNode;
        setHead(ans);
    }

    public static void main(String[] args) {
        Reverse_By_K r = new Reverse_By_K();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);

        System.out.println("Before reverseKGroup by 2: ");
        r.print();

        System.out.println("After reverseKGroup by 2: ");
        r.reverseKGroup(2);

        r.print();
    }
}
