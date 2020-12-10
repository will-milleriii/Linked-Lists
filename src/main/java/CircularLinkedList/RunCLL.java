package CircularLinkedList;

import LinkedLists.SinglyLinkedList;

public class RunCLL {
    public static void main(String[] args){
        CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(100);
        list.insertFirst(50);
        list.insertFirst(99);
        list.insertFirst(88);
        list.insertLast(77);

        list.displayList();
    }
}
