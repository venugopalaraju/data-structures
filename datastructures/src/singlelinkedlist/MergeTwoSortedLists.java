package singlelinkedlist;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList(10);
        list1.append(11);
        list1.append(12);
        list1.append(13);
        list1.append(14);
        LinkedList list2 = new LinkedList(15);
        list2.append(16);
        list2.append(17);
        list2.append(18);
        list2.append(19);
        merge(list2.head,list1.head);
        list1.print();
        System.out.println();
        list2.print();
    }

    private static Node merge(Node list1, Node list2) {
        if(list1 == null) return list2;
        if (list2 == null) return list1;
        if(list1.data<list2.data) {
            list1.next = merge(list1.next,list2);
            return list1;
        }else {
            list2.next = merge(list2.next,list1);
            return list2;
        }
    }
}
