package linked_list.hard_linked_list;

import java.util.HashMap;

public class Copy_LinkedList extends LinkedList<Integer>{


       class Extender<Integer> extends Node<Integer>{

           Extender random;

        Extender(Integer data){
            super(data);
            this.random = null;
        }

    }
    public void copyRandomList(Extender head) {


        HashMap<Extender, Extender> map = new HashMap<>();


        Extender curr = head;
        while (curr != null) {
            map.put(curr, new Extender(curr.data));
            curr = (Extender) curr.next;
        }


        curr = head;
        while (curr != null) {
            Extender copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = (Extender) curr.next;
        }

         setHead(map.get(head));
    }

    public static void main(String[] args) {
        Copy_LinkedList list = new Copy_LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        list.copyRandomList(null);







    }
}
