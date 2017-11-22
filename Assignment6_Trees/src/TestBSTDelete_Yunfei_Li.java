//Name: Yunfei Li
//Class: CS5040
//Assignment 6 - Trees
//Term: Summer 2017
public class TestBSTDelete_Yunfei_Li {
    public static void main(String[] args) {
        BST_Yunfei_Li<String> tree = new BST_Yunfei_Li<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        printTree(tree);


        System.out.println("\nAfter delete George: ");
        tree.delete("George");
        printTree(tree);

        System.out.println("\nAfter delete Adam: ");
        tree.delete("Adam");
        printTree(tree);

        System.out.println("\nAfter delete Michael: ");
        tree.delete("Michael");
        printTree(tree);
    }

    public static void printTree(BST_Yunfei_Li tree){
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());
        System.out.println();
    }
}
