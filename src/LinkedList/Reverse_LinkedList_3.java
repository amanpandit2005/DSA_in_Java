package LinkedList;

public class Reverse_LinkedList_3 {
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
            if(head==null || head.next==null){
                return head;
            }
            Node a=head.next;
            head.next=null;
            Node b=reverseList(a);
            a.next=head;
            return b;
        }
    }
}
