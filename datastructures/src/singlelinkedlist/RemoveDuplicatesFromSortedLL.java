package singlelinkedlist;


public class RemoveDuplicatesFromSortedLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(10);
        list.append(11);
        list.append(12);
        list.append(12);
        list.append(14);
        list.append(15);
        list.append(16);
        list.append(16);
        list.append(17);
        list.print();
        System.out.println();
        removeDuplicates(list.get(0));
        list.print();
    }

    private static void removeDuplicates(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        head = temp;
    }
}
