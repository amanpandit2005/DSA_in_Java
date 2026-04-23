package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Reverse_SubList_of_LinkedList_2 {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    class Solution {
        public static void reverse(Node head) {
            Node prev = null;
            Node curr = head;
            Node fwd = null;
            while (curr != null) {
                fwd = curr.next;
                curr.next = prev;
                prev = curr;
                curr = fwd;
            }
        }

        public Node reverseBetween(int l, int r, Node head) {
            Node dummy = new Node(-1);
            Node temp = dummy;
            dummy.next = head;

            for (int i = 1; i <= l - 1; i++) {
                temp = temp.next;
            }
            Node tail1 = temp;
            Node head2 = temp.next;

            for (int i = 1; i <= r - l + 1; i++) {
                temp = temp.next;
            }
            Node tail2 = temp;
            Node head3 = temp.next;

            tail1.next = null;
            tail2.next = null;

            reverse(head2);

            tail1.next = tail2;
            head2.next = head3;

            return dummy.next;
        }
    }
}
