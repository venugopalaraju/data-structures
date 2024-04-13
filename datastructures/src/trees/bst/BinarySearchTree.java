package trees.bst;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public BinarySearchTree(int value) {
        Node node = new Node(value);
        this.root = node;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.value == value) return false;
            if (temp.value > value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.value < value) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        return true;
                    }
                    temp = temp.right;
                }
            }
        }
    }

    public boolean contains(int value){
        if (root == null) return false;
        Node temp = root;
        while (temp!=null){
            if(temp.value<value){
                temp = temp.right;
            }else if (temp.value>value){
                temp = temp.left;
            }else {
                return true;
            }
        }
        return false;
    }
}
