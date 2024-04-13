package trees.bst;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(10);
        System.out.println("BST Root ::"+bst.root.value);
        bst.insert(5);
        bst.insert(11);
        bst.insert(6);
        System.out.println("Print 6 ::"+bst.root.left.right.value);
    }
}
