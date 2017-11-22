import sun.reflect.generics.tree.Tree;


//Name: Yunfei Li
//Class: CS5040
//Assignment 6 - Trees
//Term: Summer 2017
public abstract class AbstractTree_Yunfei_Li<E> implements Tree_Yunfei_Li<E>{
    @Override
    /** Inorder traversal from the root*/
    public void inorder(){

    }

    @Override
    /** Postorder traversal from the root */
    public void postorder(){

    }

    @Override
    /** Preorder traversal from the root */
    public void preorder(){

    }

    @Override
    /** Return true if the tree is empty */
    public boolean isEmpty(){
        return getSize() == 0;
    }
}
