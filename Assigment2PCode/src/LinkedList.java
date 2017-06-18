/*
This class define a linked list that stores integer values.
*/

public class LinkedList
{
    private Node head, tail;
    private int size;

    //constructor to create a list object with head, tail, and size.
    public LinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }

    //method add node to end of list
    public void addLastNode(int data)
    {
        if (tail == null)
            head = tail = new Node(data);//empty list
        else
        {
            tail.next = new Node(data); //link new node as last node
            tail = tail.next; //make tail pointer points to last node
        }
        size++; //increase list size by one
    }


    //================= your part to complete ==============


    //method add first node
    public void addFirstNode(int data)
    {
        //complete this method
        if(head == null){  //make sure list is not empty
            Node newNode = new Node(data); //create new node if list is empty
        }else {
            Node newNode = new Node(data); //creates a new node
            newNode.next = head; //linking the next node's data to the newNode's next field
            head = newNode; //make the newNode's data as head
        }
        size++; //increase the list size.
    }

    //method add node at index
    public void addAtIndex(int index, int data)
    {
        //complete this method
    }

    //method remove first node
    public void removeFirstNode()
    {
        //complete this method
        if(head == null){
            head = null; //make sure the list is not empty
        }else{
            Node temp = head; //creates temp variable to hold the existing head
            head = head.next; //make head the value of the next head
            temp.next = null; //remove the current value
        }
    }

    //method remove last node
    public void removeLastNode()
    {
        Node last = head; //temp variable to point at head
        Node previousToLast = null; //temp variable to make null
        while(last.next != null){ //loop through the list and make sure last.next is null which is last possible place
            previousToLast = last; //make previousToLast point at Last
            last = last.next;
        }
        previousToLast.next = null; //make previousToLast.next equal to null which is the end of the list
    }

    //method remove node at index
    public void removeAtIndex(int index)
    {
        //complete this method
        Node previous = head;
        int count = 1;
        while(count < index-1){
            previous = previous.next;
            count++;
        }
        Node current = previous.next;
        previous.next = current.next;
        current.next = null;
    }

    //================= end of your part ==============

    //method to print out the list
    public void printList()
    {
        Node temp;
        temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
    }

    //class to create nodes as objects
    private class Node
    {
        private int data;  //data field
        private Node next; //link field

        public Node(int item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}

