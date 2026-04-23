package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Detect_Loop_in_LinkedList {

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

    class Solution {
        public boolean detectLoop(Node head) {
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }
    }
}
//public boolean detectLoop(Node head) {
//    Node slow = head;
//    Node fast = head;
//    while(fast!=null && fast.next!=null && fast.next.next!=null){
//        slow = slow.next;
//        fast = fast.next.next.next;
//        if(fast==slow){
//            return true;
//        }
//    }
//    return false;
//}
