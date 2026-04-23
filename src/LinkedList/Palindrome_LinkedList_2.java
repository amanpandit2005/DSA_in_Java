package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Palindrome_LinkedList_2 {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
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
        public boolean isPalindrome(Node head) {
            Node slow = head;
            Node fast = head;
            while(fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node head2=slow.next;
            slow.next=null;
            head2=reverseList(head2);

            Node i=head;
            Node j=head2;
            while(j!=null){
                if(i.data!=j.data){
                    return false;
                }
                i=i.next;
                j=j.next;
            }
            return true;

        }
    }
}
