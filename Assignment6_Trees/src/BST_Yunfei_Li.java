public class  BST_Yunfei_Li<E extends Comparable<E>>
        extends AbstractTree_Yunfei_Li<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    /** create a default binary search tree */
    public BST_Yunfei_Li(){

    }

    /** Create a binary search tree from an array of objects */
    public BST_Yunfei_Li(E[] objects){
        for(int i = 0; i < objects.length; i++){
            insert(objects[i]);
        }
    }

    @Override /** Return true if the element is in the tree **/
    public boolean search(E e){
        TreeNode<E> current = root; //start from the root

        while(current != null){
            if(e.compareTo(current.element)<0){
                current = current.left;
            }
            else if(e.compareTo(current.element) > 0){
                current = current.right;
            }else{
                // element matches current.element
                return true;
            }
        }
        return false;
    }

    @Override
    /** Insert element e into the binary search tree
     Return true if the element is inserted successfully. */

    public boolean insert(E e){
        if(root ==null){
            root = createNewNode(e); //create a new root
        }else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while(current != null){
                if(e.compareTo(current.element)<0){
                    parent = current;
                    current = current.left;
                }else if(e.compareTo(current.element)>0){
                    parent = current;
                    current = current.right;
                }else{
                    return false;
                }
            }
            //create new node and attach it to the parent node
            if(e.compareTo(parent.element)<0){
                parent.left = createNewNode(e);
            }else{
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public void inorder(){
        inorder(root);
    }
    /** Inorder traversal from a subtree **/
    protected void inorder(TreeNode<E> root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element+" ");
        inorder(root.right);
    }
    @Override
    public void postorder(){
        postorder(root);
    }

    /** postorder traversal from a subtree **/
    protected void postorder(TreeNode<E> root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    @Override
    public void preorder(){
        preorder(root);
    }

    protected void preorder(TreeNode<E> root){
        if(root == null) return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }


    /** This inner class is static because it does not access any instance member
        defined in its outer class */
    public static class TreeNode<E extends Comparable<E>>{
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;

        public TreeNode(E e){
            element = e;
        }
    }

    @Override /** get the number of nodes in the tree **/
    public int getSize(){
        return size;
    }

    /** returns the root of the tree */
    public TreeNode<E> getRoot(){
        return root;
    }

    public java.util.ArrayList<TreeNode<E>> path(E e){
        java.util.ArrayList<TreeNode<E>> list =
                new java.util.ArrayList<>();
        TreeNode<E> current = root; //start from the root

        while(current !=null){
            list.add(current);
            if(e.compareTo(current.element)<0){
                current = current.left;
            }else if(e.compareTo(current.element)>0){
                current = current.right;
            }else{
                break;
            }
        }
        return list; //return an array list of nodes
    }

    @Override
    /** delete an element from the binary tree
     * return true if the element is deleted successfully
     * return false if the element is not in the tree
     */
    public boolean delete(E e){
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while(current !=null){
            if(e.compareTo(current.element)<0){
                parent = current;
                current = current.left;
            }else if (e.compareTo(current.element) > 0){
                parent = current;
                current = current.right;
            }else{
                break; //element is in the tree pointed at by current
            }
        }
        if(current == null){
            return false; //element is not in tree
        }
        if(current.left == null){
            //connect the parent with the right child of the current node
            if(parent == null){
                root = current.right;
            }else {
                if(e.compareTo(parent.element)<0){
                    parent.left = current.right;
                }else{
                    parent.right = current.left;
                }
            }
        }
        else{
            //case 2: the current node has a left child
            //locate the right most node in the left subtree of
            // the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            while(rightMost.right != null){
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }
            //replace the element in current by the element in rightMost
            current.element = rightMost.element;

            //Eliminate rightmost node
            if(parentOfRightMost.right == rightMost){
                parentOfRightMost.right = rightMost.left;
            }else{
                //special case : parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
            }
        }
        size--;
        return true; //delete successfully
    }

    @Override /** obtain an iterator use inorder */
    public java.util.Iterator<E> iterator(){
        return new InorderIterator();
    }

    //Inner class InorderIterator
    public class InorderIterator implements java.util.Iterator<E>{
        private java.util.ArrayList<E> list = new java.util.ArrayList<>();
        private int current = 0; //point to the current element in list

        public InorderIterator(){
            inorder(); //traverse binary tree and store element in list
        }


        /** Inorder traversal from the root */
        public void inorder(){
            inorder(root);
        }

        /** inorder traversal from a subtree */
        public void inorder(TreeNode<E> root){
            if(root==null){
                return;
            }
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
        }

        @Override /**More elements for traversing? */
        public boolean hasNext(){
            if(current<list.size()){
                return true;
            }
            return false;
        }

        @Override /** get the current element and move to the next */
        public E next(){
            return list.get(current++);
        }

        @Override /**Removes the current element */

        public void remove(){
            delete(list.get(current)); //delete the current element
            list.clear(); //clear the list
            inorder(); //rebuild the list
        }

        /** removes all element from the tree */
        public void clear(){
            root = null;
            size = 0;
        }
    }
}