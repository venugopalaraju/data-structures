package linear.linkedlist.linkedlist;

public class LinkedList {

    private Node head;
    private class Node {
        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

    }

    public Node add(String data) {
        if(head==null){
            head = new Node(data);
        }else {
            Node temp = head;
            while(temp.next !=null){
                temp=temp.next;
            }
            temp.next = new Node(data);
        }
        return head;
    }

    public void delete(String data){
        if(head!=null){
            if(head.data.equalsIgnoreCase(data) && head.getNext()!=null){
                head = head.getNext();
            } else {
                Node temp = head;
                while(temp!=null){
                    if(temp.next.data.equalsIgnoreCase(data)){
                        temp.next = temp.next.next;
                        break;
                    }
                    else{
                        temp = temp.next;
                    }
                }
            }
        }
    }

    public void reverseList(){
        
    }

    public void print(){
        while(head!=null){
            System.out.println(head.getData());
            head = head.getNext();
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Venu");
        linkedList.add("Gopala");
        linkedList.add("Raju");
        linkedList.delete("Gopala");
        linkedList.print();
    }

}
