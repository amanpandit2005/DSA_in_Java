package L30_L31_L32_L33_L34_L35_L36_LinkedList;

import java.util.ArrayList;

public class Reverse_LinkedList_1 {
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
            Node temp=head;
            ArrayList<Node> arr=new ArrayList<>();
            while(temp!=null){
                arr.add(temp);
                temp=temp.next;
            }
            int n=arr.size();
            for(int i=n-1;i>=1;i--){
                arr.get(i).next=arr.get(i-1);
            }
            arr.get(0).next=null;
            return arr.get(n-1);
        }
    }
}
