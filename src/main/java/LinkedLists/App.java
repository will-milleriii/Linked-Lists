package LinkedLists;

public class App {

    public static void main(String[] args){
        //Creating new nodes with given data types
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        //Linking the nodes with one another

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeC));
        System.out.println(listLength(nodeA));
    }

    //Method listLength shows how many nodes are in a linked list from the given node

    public static  int listLength(Node node){
        int length = 0;
        Node currentNode = node;

        while (currentNode != null){
            length++;
            currentNode = currentNode.next;
        }
        return length;

    }

}
