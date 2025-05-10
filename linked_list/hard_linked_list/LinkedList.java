package linked_list.hard_linked_list;

public class LinkedList<T> {

   class Node<T>{
        T data;
        Node next;
        public Node(T data) {
            this.data = data;
        }
    }
    private Node<T> head;
    private  Node<T> tail;
    private int size=0;

    public Node<T> getHead() {
        return head;
    }
public void setHead(Node<T> head) {
        this.head = head;
}
    public LinkedList() {
        head = null;
    }
    public void add(T data) {
        Node node=new Node(data);
        if(head == null) {
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
        temp=temp.next;
        }
        System.out.println(" null ");
    }
}
