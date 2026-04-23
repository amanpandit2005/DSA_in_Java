package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Kth_from_End_of_LinkedList {

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

    class Solution {

        // Function to find the data of kth node from
        // the end of a linked list.
        int getKthFromLast(Node head, int k) {
            Node slow = head;
            Node fast = head;
            for(int i=1;i<=k;i++){
                if(fast == null){
                    return -1;
                }
                fast = fast.next;
            }
            while(fast!=null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
    }
}
