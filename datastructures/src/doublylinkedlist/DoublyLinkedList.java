package doublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
     class Node{
        private Node next;
        private Node prev;
         int data;
        public Node(int data) {
            this.data = data;
        }




    }

    public DoublyLinkedList(int data) {
        Node node=new Node(data);
        this.head = node;
        this.tail = node;
        length = 1;
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length ++;
    }

    public void prepend(int data){
        Node newNode = new Node(data);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length ++;
    }

    public Node removeLast(){
        if(length==0) return null;
        Node temp = tail;
        if(length==1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return  temp;
    }

    public Node removeFirst(){
        if(length==0) return null;
        Node temp = head;
        if(length==1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return  temp;
    }

    public void printList(){
        Node temp = head;
        while (null!=temp){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
}
