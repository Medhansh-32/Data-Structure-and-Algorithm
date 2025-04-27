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

    }


    public static   void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        System.out.println(list.size());
    }
}
