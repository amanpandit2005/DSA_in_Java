package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Deletion_in_Circular_LinkedList {
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

    class Solution {
        Node deleteNode(Node head, int key) {
            Node tail = head;
            while(tail.next!=head){
                tail = tail.next;
            }
            tail.next = null;
            if(head.data==key){
                head = head.next;
                tail.next = head;
                return head;
            }
            Node temp1 = head;
            Node temp2 = head.next;
            while(temp2!=null){
                if(temp2.data==key){
                    temp1.next = temp2.next;
                    break;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            tail.next = head;
            return head;
        }
    }
}
