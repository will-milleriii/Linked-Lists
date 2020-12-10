package LinkedLists;

public class SinglyLinkedList {
   private Node first;

   public SinglyLinkedList(){

   }

   //check if list is empty
   public boolean isEmpty(){
      return (first ==  null);
   }

   //used to insert at beginning of list
   public void insertFirst(int data){
      Node node = new Node();
      node.data = data;
      node.next = first;
      first = node;
   }

   //assign first node to temporary variable and then assign first node to the next node essentially deleting it
   public Node deleteFirst(){
      Node temp = first;
      first = first.next;
      return temp;
   }

   public void displayList(){
      System.out.println("List (first -> last) ");
      Node current = first;
      while (current != null) {
         current.displayNode();
         current = current.next;
      }
      System.out.println();
   }
   public void insertLast(int data){
      Node current = first;
      while (current.next != null){
         current = current.next; //loop will run until .next = null
      }
      Node newNode = new Node();
      newNode.data = data;
      current.next = newNode;

   }

}
