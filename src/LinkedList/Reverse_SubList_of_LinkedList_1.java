package L30_L31_L32_L33_L34_L35_L36_LinkedList;

import java.util.ArrayList;

public class Reverse_SubList_of_LinkedList_1 {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    class Solution {
        public static Node reverseBetween(int a, int b, Node head) {
            ArrayList<Node> arr = new ArrayList<>();
            Node temp = head;
            while(temp!=null){
                arr.add(temp);
                temp = temp.next;
            }
            int i =a-1, j = b-1;
            while(i<j){
                Node t1 = arr.get(i);
                Node t2 = arr.get(j);
                arr.set(i,t2);
                arr.set(j,t1);
                i++;
                j--;
            }
            for(i=0;i<arr.size();i++){
                arr.get(i).next = (i==arr.size()-1) ? null : arr.get(i+1);
            }
            return arr.get(0);
        }
    }
}
