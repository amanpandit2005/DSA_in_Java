package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Reverse_LinkedList_2 {
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

    class Solution {
        Node reverseList(Node head) {
            Node current=head;
            Node previous=null;
            Node forward=null;
            while(current!=null){
                forward=current.next;
                current.next=previous;
                previous=current;
                current=forward;
            }
            return previous;
        }
    }
}
