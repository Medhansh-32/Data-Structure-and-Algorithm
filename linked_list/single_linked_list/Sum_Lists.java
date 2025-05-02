package linked_list.single_linked_list;

public class Sum_Lists {


    /**
     * Definition for singly-linked list.
     * public class Node {
     *     int data;
     *     Node next;
     *     Node() {}
     *     Node(int data) { this.data.intValue() = data; }
     *     Node(int data, Node next) { this.data.intValue() = data; this.next = next; }
     * }
     */

        static class LinkedList<T extends Number> {

            private Node head = null;

            private Node tail = null;

            public Node getHead(){
                return head;
            }
           static class Node<T extends Number> {
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
                    System.out.print(temp.data.intValue() + " -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }
            public static <T extends Number> LinkedList<T> addTwoNumbers(Node l1, Node l2) {
                Node temp = l1;
                Node temp2 = l2;

                Node head = new Node(-1);
                Node ans1 = head;
                int sum = 0;
                int carry = 0;
                while (temp != null && temp2 != null) {
                    sum = carry + temp.data.intValue() + temp2.data.intValue();

                    if (sum>= 10) {
                        int rem = sum % 10;
                        if (head == null) {
                            Node sum1 = new Node(rem);
                            head = sum1;
                            head.next = null;
                        } else {
                            Node sum1 = new Node(rem);
                            ans1.next = sum1;
                            ans1 = sum1;
                        }
                        carry = sum / 10;
                    } else {
                        if (head == null) {
                            Node sum1 = new Node(sum);
                            head = sum1;
                            head.next = null;
                        } else {
                            Node sum1 = new Node(sum);
                            ans1.next = sum1;
                            ans1 = sum1;
                        }
                        carry = sum / 10;
                    }
                    temp = temp.next;
                    temp2 = temp2.next;

                }
                while (temp != null) {
                    sum = carry + temp.data.intValue();

                    if (sum >= 10) {
                        int rem = sum % 10;
                        if (head == null) {
                            Node sum1 = new Node(rem);
                            head = sum1;
                            head.next = null;
                        } else {
                            Node sum1 = new Node(rem);
                            ans1.next = sum1;
                            ans1 = sum1;
                        }
                        carry = sum / 10;
                    } else {
                        if (head == null) {
                            Node sum1 = new Node(sum);
                            head = sum1;
                            head.next = null;
                        } else {
                            Node sum1 = new Node(sum);
                            ans1.next = sum1;
                            ans1 = sum1;
                        }
                    }
                    carry = sum / 10;
                    temp = temp.next;
                }
                while (temp2 != null) {
                    sum = carry + temp2.data.intValue();

                    if (sum >= 10) {
                        int rem= sum % 10;
                        if (head == null) {
                            Node sum1 = new Node(rem);
                            head = sum1;
                            head.next = null;
                        } else {
                            Node sum1 = new Node(rem);
                            ans1.next = sum1;
                            ans1 = sum1;
                        }
                        carry = sum / 10;
                    } else {
                        if (head == null) {
                            Node sum1 = new Node(sum);
                            head = sum1;
                            head.next = null;
                        } else {
                            Node sum1 = new Node(sum);
                            ans1.next = sum1;
                            ans1 = sum1;
                        }
                    }
                    carry = sum / 10;
                    temp2 = temp2.next;
                }
                if (carry != 0) {
                    Node sum1 = new Node(carry);
                    ans1.next = sum1;
                    ans1 = sum1;
                }
                LinkedList<T> ans=new LinkedList<>();
                head=head.next;
                while (head != null) {
                    ans.add((T) head.data);
                    head = head.next;
                }
                return ans;
            }
        }



    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(6);
    list.add(9);
        System.out.println("List 1 : ");
    list.printList();

    LinkedList<Integer> list2 = new LinkedList<>();
    list2.add(1);
    list2.add(2);
    list2.add(9);

        System.out.println("List 2 : ");
    list2.printList();
       LinkedList<Integer> sumNode=LinkedList.addTwoNumbers(list.getHead(), list2.getHead());

        System.out.println("\n\n Sum of List is : ");
    sumNode.printList();


    }
}
