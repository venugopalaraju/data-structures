package singlelinkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node node = new Node(value);
        if (head==null) {
            head = node;
            tail = node;
            length = 1;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
        tail = pre;
        length--;
        return tail;
    }

    public void print(){
        Node temp = head;
        if (length==0){
            System.out.println("Linkedlist is Empty");
        } else {
            while (temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
