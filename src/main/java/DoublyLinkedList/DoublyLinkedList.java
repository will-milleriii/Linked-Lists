package DoublyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()){
            last = newNode; //if empty, last refers to the new Node being created
        } else {
            first.previous = newNode;
        }
        newNode.next = first; //next field will point to old first node;
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            first = newNode;
        } else {
            last.next = newNode; //assigning old last to the new node
            newNode.previous = last; //old last = new node's previous
        }
        last = newNode; //last field of doubly linked list should point to the new node
    }

    //assume non-empty list
    public Node deleteFirst(){
        Node temp = first;
        if (first.next == null){ //only one item in list in this case
            last = null;
        } else{
            first.next.previous = null; //deleting first so that first node will be null
        }
        first = first.next; //assigning reference of the node following the old first node to first field in the linked list
        return temp; //return the deleted old first node;
    }

    //assume non-empty list
    public Node deleteLast(){
        Node temp = last;
        if (first.next == null){ //only one node in this case
            last = null;
        } else {
            last.previous.next = null; //long way of stating that if the previous nodes next field would point to null making it the last node
        }
        last = last.previous;
        return temp;
    }

    //assume non-empty list
    public boolean insertAfter(int key, int data){
        Node current = first; //start from beginning of linkedList
        while (current.data != key){ // as long as we haven't hit the key yet in a specific node
            current = current.next;
            if (current == null){
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;

        if (current == last){
            current.next = null;
            last = newNode;
        } else{
            newNode.next = current.next; //newNode's next field should point ahead of the current one
            current.next.previous = newNode; //the field of the node ahead of current should have its previous node point to the new one?
        }

        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    //assume list has at least one object
    public Node deleteKey(int key){
        Node current = first; //start from beginning then loop through
        while (current.data != key){
            current = current.next;
            if (current == null){
              return null;
            }
        }
        if (current == first){
            first = current.next; //make first field point to node following current (since current will be deleted)
        } else {
            current.previous.next = current.next; //previous node's next field will have to be equal to next node
        }

        if (current == last) {
            last = current.previous; // if current == last and its deleted, last will now have to equal current.previous
        } else {
            current.next.previous = current.previous;
        }
        return current;

    }

    public void displayForward(){
        System.out.println("List (first --> last): ");
        Node current = first; //start from beginning
        while (current != null){
            current.displayNode(); //calls display method of the node
            current = current.next; // moves to next node
        }
        System.out.println();
    }

    public void displayBackwards(){
        System.out.println("List (last --> first): ");
        Node current = last; //start from end
        while(current != null){
            current.displayNode(); //calls display method of the node
            current = current.previous; //moves to previous node
        }
        System.out.println();
    }


}
