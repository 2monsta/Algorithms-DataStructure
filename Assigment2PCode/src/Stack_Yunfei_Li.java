import java.util.*;

//Name: Yunfei Li
//Class: CS5040
//Assignment 4 - stack
//Term: Summer 2017


public class Stack_Yunfei_Li {
    private Stack_Yunfei_Li top; //top of the stack
    private int size; //size of the stack

    public Stack_Yunfei_Li(){
        top = null;
        size = 0;
    }

    //get size method
    public int getSize(){
        return size;
    }

    //method to test if stack is empty
    public boolean isEmpty(){
        return top == null;
    }
}
