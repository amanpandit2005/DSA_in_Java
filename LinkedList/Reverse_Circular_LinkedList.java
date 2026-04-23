package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Reverse_Circular_LinkedList {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
    class Solution {
        void reverseList(Node head){
            Node prev = null;
            Node curr = head;
            Node fwd = null;
            while(curr!=null){
                fwd = curr.next;
                curr.next = prev;
                prev = curr;
                curr = fwd;
            }
        }
        public Node reverseCircular(Node head) {
            Node tail = head;
            while(tail.next!=head){
                tail = tail.next;
            }
            tail.next = null;
            reverseList(head);
            head.next = tail;
            return tail;
        }
    }
}
