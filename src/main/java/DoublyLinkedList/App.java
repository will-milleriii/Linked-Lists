package DoublyLinkedList;

public class App {

    public static void main(String[] args){

        //test example without creating tests (come back later for unit tests)
        DoublyLinkedList newList = new DoublyLinkedList();

        //inserting data first
        newList.insertFirst(10);
        newList.insertFirst(15);
        newList.insertFirst(7);

        //inserting node last
        newList.insertLast(104);
        newList.insertLast(29);
        newList.insertLast(32);


        //displaying nodes forwards and backwards
        newList.displayForward();
        newList.displayBackwards();

        //deletes at different indices
        newList.deleteFirst();
        newList.deleteLast();
        newList.deleteKey(7);
        newList.displayForward();


        //inserts after specific keys
        newList.insertAfter(10, 22);
        newList.insertAfter(104, 88);
        newList.displayForward();
    }

}
