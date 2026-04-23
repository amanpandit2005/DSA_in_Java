package L30_L31_L32_L33_L34_L35_L36_LinkedList;

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
