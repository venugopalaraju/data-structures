package linear.linkedlist;

public class LinkedList {

    private Node head;
    public Node add(String data) {
        if(head==null){
            head = new Node(data);
        }else {
            Node temp = head;
            while(temp.getNext() !=null){
                temp= temp.getNext();
            }
            temp.setNext(new Node(data));
        }
        return head;
    }

    public void delete(String data){
        if(head!=null){
            if(head.getData().equalsIgnoreCase(data) && head.getNext()!=null){
                head = head.getNext();
            } else {
                Node temp = head;
                while(temp!=null){
                    if(temp.getNext().getData().equalsIgnoreCase(data)){
                        temp.setNext(temp.getNext().getNext());
                        break;
                    }
                    else{
                        temp = temp.getNext();
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
