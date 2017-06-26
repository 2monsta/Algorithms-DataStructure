//Name: Yunfei Li
//Class: CS5040
//Assignment 4 - stack
//Term: Summer 2017

/*
This class define a linked list that stores integer values.
*/

public class Stack_Yunfei_Li{

    private Node head, tail;
    private int size;

    //constructor to create a list object with head, tail, and size.
    public Stack_Yunfei_Li()
    {
        head = null;
        tail = null;
        size = 0;
    }

    //method add node to end of list
    public void addStack(int data)
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
    //method to get size of the stack
    public int getSize(){
        return size;
    }

    //method to test if stack is empty
    public boolean isEmpty(){
        return size ==0;
    }

    //method to return top()
    public int top(){
        return tail.data;
    }
    // method to push(e) for testStack
    public void push(int data){
        Node newTop = new Node(data); //creates a new node
        if(head == null){ //check if the node is empty
            head = newTop;
            tail = newTop;
        }else{
            //generic case to add to top of the stack
            tail.next = newTop;
            tail = tail.next;
        }
        size++;
    }
    //method to return top with string
    public String topToString(){
        return tail.data1;
    }
    //method to push(e) to string for reverseString
    public void pushToString(String data){
        Node newTop = new Node(data); //creates a new node
        if(head == null){ //check if the node is empty
            head = newTop;
            tail = newTop;
        }else{
            //generic case to add to top of the stack
            tail.next = newTop;
            tail = tail.next;
        }
        size++;
    }

    //method to test pop()
    public void pop(){
        if(isEmpty()){
            head= null;
            tail = null;
        }
        //test if it's one node stack
        if(size ==1 ){
            Node temp = head;
            head = tail = null;
            size = 0;
        }
        Node current = head;
        for( int i = 1; i < size -1; i++){
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
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
    public class Node
    {
        private int data;  //data field
        private String data1;
        private Node next; //link field

        public Node(int item) //constructor method
        {
            data = item;
            next = null;
        }
        public Node(String items){
            data1 = items;
            next = null;
        }
    }
}
