//Name: Yunfei Li
//Class: CS5040
//Assignment 5 - Queues
//Term: Summer 2017

public class Queue_Yunfei_Li {
        private Node first, last;
        private int size;

        //constructor to create a list object with head, tail, and size.
        public Queue_Yunfei_Li()
        {
            first = null;
            last = null;
            size = 0;
        }

        //================= your part to complete ==============
        //method to enqueue(data)
        public void enqueue(int data){
            Node newNode = new Node(data);

            if(first == null){
                first = newNode;
                last = newNode;
            }

            last.next = newNode;
            last = last.next;
            size++;
        }

        //method dequeue();
        public void dequeue(){
            //check if the queue is empty
            if(size == 0){
                first = null;
                last = null;
            }
            Node current = first; // declare current and set to first
            first = first.next; // make first point to next node
            current.next = null; // set current.next to null
            size--; //decrease the size by one element
        }

        //method to get front of the queue
        public int front(){
            return first.data;
        }

        //method to get size of queue()
        public int getSize(){
            return size;
        }

        //method to see if queue is empty
        public boolean isEmpty(){
            return size == 0;
        }

        //================= end of your part ==============

        //method to print out the list
        public void printList()
        {
            Node temp;
            temp = first;
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



