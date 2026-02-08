package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class First_Node_of_Loop_in_LinkedList {
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};

    class Solution {
        public int cycleStart(Node head) {
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast==slow){
                    Node temp=head;
                    while(temp!=slow){
                        temp=temp.next;
                        slow=slow.next;
                    }
                    return slow.data;
                }
            }
            return -1;
        }
    }
}
