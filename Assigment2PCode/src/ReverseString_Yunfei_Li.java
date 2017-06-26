//Name: Yunfei Li
//Class: CS5040
//Assignment 4 - stack
//Term: Summer 2017

import java.util.Scanner;

public class ReverseString_Yunfei_Li {

    //method to reverse a string using stack
    public static void reverse()throws Exception {
        //take user input
        Scanner input = new Scanner(System.in);
        //create new stack
        Stack_Yunfei_Li st = new Stack_Yunfei_Li();
        System.out.print("Enter a string: ");
        //store string into string array
        String str[] = input.nextLine().split(" ");
        System.out.println();
        System.out.print("input string: ");
        //loop through the string array and push to stack
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
            st.pushToString(str[i]);
        }
        System.out.println();
        System.out.print("output string: ");
        //loop through the stack and print out top of the stack and then pop the stack
        while (st.isEmpty() !=true) {
            System.out.print(st.topToString() + " ");
            st.pop();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try{
            reverse();
        }catch (Exception e){
        }
    }
}