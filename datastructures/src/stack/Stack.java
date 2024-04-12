package stack;

public class Stack {

    private Node top;
    private int height;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public Stack(int value) {
        Node temp = new Node(value);
        this.top = temp;
        height = 1;
    }

    public int getHeight(){
        return this.height;
    }

    public void printStack(){
        Node temp=top;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
}
