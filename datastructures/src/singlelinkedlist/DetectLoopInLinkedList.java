package singlelinkedlist;

public class DetectLoopInLinkedList {
    public static void main(String[] args) {
        Node node=new Node(10);
        node.next = new Node(11);
        node.next = node;
        System.out.println(hasLoop(node));
    }

    private static boolean hasLoop(Node node) {
        Node slow = node.next;
        Node fast = node.next;
        while (slow!=null && fast!=null && fast.next!=null){
            if(slow==fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return false;
    }
}
