package singlelinkedlist;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(10);
        list.append(11);
        list.append(12);
        list.append(13);
        list.append(14);
        list.append(15);
        list.append(16);
        list.append(17);
        System.out.println(findMiddleElement(list.get(0)));
    }

    private static int findMiddleElement(Node node) {
        Node slow = node;
        Node fast = node;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
