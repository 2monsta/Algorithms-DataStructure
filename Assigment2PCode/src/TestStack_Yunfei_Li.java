//Name: Yunfei Li
//Class: CS5040
//Assignment 4 - stack
//Term: Summer 2017


public class TestStack_Yunfei_Li {

    public static void main(String[] args) {
        Stack_Yunfei_Li myStack = new Stack_Yunfei_Li(); //create a stack object


        //method to test push(e)
        System.out.println("Testing push(e), pushing 5 numbers to the stack");
        for (int i = 1; i <= 5; i++) //add 5 nodes to the list
        {
            myStack.push(i); //this tests push(e)
        }

        //print out the list content
        System.out.print("My test list values are:  ");
        myStack.printList();

        //Write code to test each completed method in class LinkedList
        System.out.println(); //adds a new line

        System.out.println(); //new line

        //method to test pop()
        System.out.print("My test values before popping: ");
        myStack.printList(); //print list before pop()
        System.out.println(); //new line
        System.out.print("Testing pop(), my values after popping: ");
        myStack.pop(); //this test pop() the top element
        myStack.printList(); //printing the list after pop()
        System.out.println(); //new line
        System.out.println(); //new line


        //method to test getSize()
        System.out.println("Testing getSize()");
        System.out.print("The size of the stack: ");
        System.out.println(myStack.getSize()); //should return 4
        System.out.println(); //new line


        //method to test top()
        System.out.println("Testing top()");
        System.out.print("The top element: ");
        System.out.println(myStack.top()); //should return 4


        //method to test isEmpty()
        System.out.println();
        System.out.println("Testing isEmpty()");
        System.out.print("Is the stack empty: ");
        System.out.println(myStack.isEmpty()); // should return false

    }
}