package singlelinkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.print();
        linkedList.removeFirst();
        linkedList.print();
    }
}
