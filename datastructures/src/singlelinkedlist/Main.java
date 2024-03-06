package singlelinkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
//        linkedList.removeLast();
//        linkedList.removeLast();
//        linkedList.print();
//        linkedList.removeFirst();
//        linkedList.print();
        linkedList.insert(3,4);
        linkedList.print();
        System.out.println(linkedList.get(2).data);
        linkedList.remove(2);
        linkedList.print();
        linkedList.reverse();
        linkedList.print();

    }
}
