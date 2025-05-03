package linked_list.single_linked_list;

public class AddOne {

    static class LinkedList<T extends Number> {


        private Node head = null;

        private Node tail = null;

        class Node<T extends Number> {
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

        public Node ans = null;

        public Node rev(Node head) {
            if (head.next == null) {
                ans = head;
                return head;
            }

            rev(head.next).next = head;

            return head;
        }

        public LinkedList addOne() {

            if (head == null) return null;

            rev(head).next = null;

            Node temp = ans;

            Node finalAns = null;
            Node traverse = finalAns;
            int carry = 1;
            while (temp != null) {
                int sum = carry + temp.data.intValue();

                if (sum >= 10) {
                    int rem = sum % 10;
                    Node sumAns = new Node(rem);
                    if (finalAns == null) {
                        finalAns = sumAns;
                        finalAns.next = null;
                        traverse = finalAns;
                    } else {
                        traverse.next = sumAns;
                        sumAns.next = null;
                        traverse = sumAns;
                    }
                } else {
                    Node sumAns = new Node(sum);
                    if (finalAns == null) {
                        finalAns = sumAns;
                        finalAns.next = null;
                        traverse = finalAns;
                    } else {
                        traverse.next = sumAns;
                        sumAns.next = null;
                        traverse = sumAns;
                    }
                }
                carry = sum / 10;
                temp = temp.next;
            }

            if (carry != 0) {
                Node sum1 = new Node(carry);
                if (finalAns == null) {
                    finalAns = sum1;
                    finalAns.next = null;
                    traverse = finalAns;
                } else {
                    traverse.next = sum1;
                    sum1.next = null;
                    traverse = sum1;
                }
            }
            ans = null;
            rev(finalAns).next = null;
            LinkedList<T> ansList = new LinkedList<>();
            while (ans != null) {
                ansList.add((T) ans.data);
                ans = ans.next;
            }
            return ansList;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.addOne().printList();
    }


}
