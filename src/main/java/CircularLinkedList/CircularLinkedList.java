package CircularLinkedList;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            last = newNode;
        }

        newNode.next = first;// newNode --> old first
        first = newNode; //new node takes place of what the linked lists first object was pointing to
                        //first place

    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            first = newNode;
        } else {
            last.next = newNode; //next value of the last node will point to the new node
            last = newNode; //make new node we created be the last node in list
        }
    }

    public int deleteFirst(){
        int temp = first.data;
        if (first.next == null){
            last = null;
        }
        first = first.next; // first node will point to old node's next value
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

}
