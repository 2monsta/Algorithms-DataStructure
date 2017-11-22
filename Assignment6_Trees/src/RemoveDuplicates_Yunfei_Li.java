import java.util.*;

//Name: Yunfei Li
//Class: CS5040
//Assignment 6 - Trees
//Term: Summer 2017
public class RemoveDuplicates_Yunfei_Li {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence please");
        String[] str = input.nextLine().split(" ");
        System.out.print("Original String: " );
        for(int i =0; i<str.length; i++){
            System.out.print(str[i] + " ");
        }
        BST_Yunfei_Li<String> intTree = new BST_Yunfei_Li<>(str);
        System.out.print("\nInorder(sorted): ");
        intTree.inorder();
    }
}
