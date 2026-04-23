package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Circular_LinkedList_Traversal {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }

    }

    class Solution {
        /* Function to print nodes in a given Circular linked list */
        void printList(Node head) {
            System.out.print(head.data+" ");
            Node temp = head.next;
            while(temp!=head){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
}
