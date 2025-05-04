package linked_list.double_linked_list;

public class Delete_Occurrences_Key {

    static class DoubleLinkedListImpl<Integer> extends DoubleLinkedList<Integer> {

        public void deleteOccurrences(int key) {

            Node temp = getHead();
            while (temp != null) {
                if (temp.data == key && temp.prev != null) {
                    Node prev = temp.prev;
                    prev.next = temp.next;
                    if (temp.next != null) {
                        temp.next.prev = prev;
                    }
                    setSize(getSize() - 1);
                } else if (temp.data == key && temp.prev == null) {
                    setHead(temp.next);
                    if (getHead() != null && getHead().prev != null) {
                        getHead().prev = null;
                    }
                    setSize(getSize() - 1);
                }
                temp = temp.next;
            }

        }

        public void printRev() {
            Node tail = getTail();

            while (tail != null) {
                System.out.print(tail.data + " <-> ");
                tail = tail.prev;
            }
            System.out.println("null");
        }

    }


    public static void main(String[] args) {
        DoubleLinkedListImpl<Integer> list = new DoubleLinkedListImpl<>();
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(2);


        System.out.println("List before deletion : ");
        list.print();


        list.deleteOccurrences(1);
        System.out.println("\nList after deletion : ");
        list.print();


    }
}
