package linked_list.single_linked_list;


public class Linked_List_Impl {

   static class LinkedList<T> {


        private  Node head =null;

        private Node tail=null;
        class Node {
            T data;
            Node next;

            public Node(T data){
                this.data=data;
            }

        }

        public void add(T data){
            Node node =new Node(data);
            if(head==null && tail==null){
                head=node;
                tail=node;
            }else{
                tail.next=node;
                tail=node;
            }
        }

        public void printList(){
            Node temp=head;

            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public int size(){
            Node temp=head;
            int size=0;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            return size;
        }
        public T delete(int pos){
            int i=1;
            Node temp=head;
            while(i!=pos-1){
                temp=temp.next;
                i++;
            }
            T data = temp.next.data;
            temp.next=temp.next!=null?temp.next.next:temp.next;

            return data;
        }

        public int search(T data){
            Node temp = head;
            int i=0;
            while(temp!=null){
                if(temp.data==data) return i;
                i++;
                temp=temp.next;
            }
            return -1;
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

       public void reverseList() {
           rev(head).next = null;
           head=ans;

       }

        }




    public static   void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        list.delete(3);
        list.printList();
        System.out.println(list.size());

        System.out.println(list.search(6));
        System.out.println(list.search(2));
        list.printList();
        list.reverseList();
        list.printList();

    }
}
