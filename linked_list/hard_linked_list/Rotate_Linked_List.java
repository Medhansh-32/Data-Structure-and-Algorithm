package linked_list.hard_linked_list;

public class Rotate_Linked_List extends LinkedList<Integer>{

    public void rotateRight(int k) {

        Node<Integer> temp = getHead();
        Node<Integer> head = getHead();
        int node = 1;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size != 0)
            k = k % size;

        if (head == null || head.next == null || k == 0) {
            return ;
        }

        temp = head;
        node = 0;
        Node prev = null;
        while (temp != null) {
            node++;
            prev = temp;
            temp = temp.next;
            if (node == size - k) {
                break;
            }
        }

        Node ans = temp;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        prev.next = null;
        setHead(ans);
    }

    public static void main(String[] args) {
        Rotate_Linked_List list = new Rotate_Linked_List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println("Before: " + list);
        list.print();
        list.rotateRight(2);

        System.out.println("After: " + list);
        list.print();

    }
}
