import java.util.Scanner;

public class myTest
{
    public static void main (String[] args)
    {
        LinkedList myList = new LinkedList(); //create a list object

        for (int i=1; i <= 5; i++) //add 5 nodes to the list
        {
            myList.addLastNode(i);
        }

        //print out the list content
        System.out.print("My test list values are:  ");
        myList.printList();

        //Write code to test each completed method in class LinkedList
        System.out.println(); //adds a new line



        //===========================
        //Testing method addFirstNode
        //===========================

        System.out.println("Testing addFirstNode()");
        System.out.println("Adding Value 25 as first node");
        System.out.print("List content before adding first node: ");
        myList.printList(); //List content before adding first node
        System.out.println(); //new line
        myList.addFirstNode(25); //Adding 25 to the first node.
        System.out.print("List content after adding first node: ");
        myList.printList(); //List content after adding first node

        System.out.println(); //new line


        //==============================
        //Testing method removeFirstNode
        //==============================

        System.out.println("Testing removeFirstNode()");
        System.out.println("Removing value 25 from first node");
        System.out.print("List content before removing first node: ");
        myList.printList(); //List content before removing first node
        System.out.println(); //new line
        myList.removeFirstNode(); //removing first node
        System.out.print("List content after removing first node: ");
        myList.printList(); //List content after removing first node

        System.out.println(); //new line


        //===============================
        //Testing method removeLastNode
        //===============================

        System.out.println("Testing removeLastNode()");
        System.out.println("Removing value 5 from last node");
        System.out.print("List content before removing last node: ");
        myList.printList(); //List content before removing last node
        System.out.println(); //new line
        myList.removeLastNode(); //remove last node
        System.out.print("List content after removing last node: ");
        myList.printList(); //List content after removing last node

        System.out.println(); //new line


        //===============================
        //Testing method removeAtIndex
        //===============================

        System.out.println("Testing removeAtIndex()");
        System.out.println("Removing index 3 from list");
        System.out.print("List content before removing index 3: ");
        myList.printList(); //List content before removing at index
        System.out.println();// new line
        myList.removeAtIndex(3); //removing index 3
        System.out.print("List content after removing index 3: ");
        myList.printList();

        System.out.println(); //new line

        //===============================
        //Testing method addAtIndex
        //===============================

        System.out.println("Testing addAtIndex()");
        System.out.println("Add index 3 data 3 to list");
        System.out.print("List content before adding index 3 data 3: ");
        myList.printList();//List content before adding at index
        System.out.println(); //new line
        myList.addAtIndex(3,3); // adding to index 3 data 3
        System.out.print("List content after adding index 3 data 3: ");
        myList.printList();
    }
}

