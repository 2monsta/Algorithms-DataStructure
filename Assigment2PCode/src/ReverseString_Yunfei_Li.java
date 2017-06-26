//Name: Yunfei Li
//Class: CS5040
//Assignment 4 - stack
//Term: Summer 2017

import java.util.Scanner;

public class ReverseString_Yunfei_Li {

    //method to reverseString()
//    public static void reverse(){
//        Scanner input = new Scanner(System.in);
//        Stack_Yunfei_Li st = new Stack_Yunfei_Li();
//        System.out.println("Enter a string");
//        String str[] = input.nextLine().split(" ");
//        for(int i = 0; i<str.length; i++){
//            st.push(i);
//        }
////        String finalString = "";
////        for(int i = 0; i<st.getSize(); i++){
////            finalString += st.pop();
////            st.pop();
////        }
//        while(st.isEmpty() == true){
//            System.out.println(st.top());
//            st.pop();
//        }
//
//    }



    public static void reverse()
    {
        Scanner input = new Scanner(System.in);
        Stack_Yunfei_Li st = new Stack_Yunfei_Li();
        System.out.println("Enter a string");
        String str[] = input.nextLine().split(" ");
        for(int i = 0; i<str.length; i++){
            st.push(i);
        }

        String[] reversedArray = new String[st.getSize()];

        for(int i = 0; i<st.getSize(); i++){
            reversedArray[i] = st.pop();
        }

        String reverseStr = "";

        for(String word : reversedArray) {
            reverseStr += word + " ";
        }

        System.out.println(reverseStr); //could use reversedStr.trim() to get rid of leading and trailing white space.

    }
    public static void main(String[] args) {
        reverse();
    }

}
