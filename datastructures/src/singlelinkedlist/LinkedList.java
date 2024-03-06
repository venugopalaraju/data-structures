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
    public void prepend(int vaule){
        Node newNode = new Node(vaule);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
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
    public Node removeFirst(){
        if(length==0) return null;
        Node temp = head.next;
        head = temp;
        temp = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return head;
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

    public Node get(int index){
        if(index<0||index>length){
            return null;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public boolean insert(int index,int value){
        if(index<0||index>length) return false;
        if(index==0){
            prepend(value);
            return true;
        } else if (index==length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index > length) return null;
        if (index == 0) removeFirst();
        if (index == length-1) return removeLast();
        Node preNode = get(index-1);
        Node temp = preNode.next;
        preNode.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head=tail;
        tail=temp;
        Node after = temp.next;
        Node before = null;
        for (int i=0;i<length;i++){
            after = temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }
}
