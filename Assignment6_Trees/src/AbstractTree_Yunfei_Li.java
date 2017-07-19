import sun.reflect.generics.tree.Tree;

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
