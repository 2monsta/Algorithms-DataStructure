
public class TestBST_Yunfei_Li {
    public static void main(String[] args) {
        //create BST
        BST_Yunfei_Li<String> tree = new BST_Yunfei_Li<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        //traverse tree

        System.out.print("Inorder (sorted): ");
        tree.inorder();

        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());

        //search for an element
        System.out.print("\nIs Peter in the tree? " + tree.search("Peter"));


        //Get a path from the root to Peter
        System.out.print("\nA path from the root to Peter is: ");
        java.util.ArrayList<BST_Yunfei_Li.TreeNode<String>> path = tree.path("Peter");
        for(int i = 0; path !=null && i<path.size(); i++){
            System.out.print(path.get(i).element + " ");
        }
        Integer[] numbers = {2, 4, 3, 1, 8, 6, 7};
        BST_Yunfei_Li<Integer> intTree = new BST_Yunfei_Li<>(numbers);
        System.out.print("\nInorder(sorted): ");
        intTree.inorder();



    }
}
