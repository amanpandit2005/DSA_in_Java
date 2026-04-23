package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Middle_of_LinkedList_1 {
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
    class Solution {
        int getMiddle(Node head) {
            int length = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                length++;
            }
            temp = head;
            for(int i=1;i<=length/2;i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
}
