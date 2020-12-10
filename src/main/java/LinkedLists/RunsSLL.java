package LinkedLists;

public class RunsSLL {

    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(100);
        list.insertFirst(50);
        list.insertFirst(99);
        list.insertFirst(88);
        list.insertLast(77);

        list.displayList();
    }
}
