package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.prepend(4);
        doublyLinkedList.removeLast();
        doublyLinkedList.removeFirst();
        doublyLinkedList.printList();
    }
}
