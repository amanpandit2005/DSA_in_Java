package L30_L31_L32_L33_L34_L35_L36_LinkedList;

import java.util.ArrayList;

public class Palindrome_LinkedList_1 {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class Solution {
        public boolean isPalindrome(Node head) {
            Node temp = head;
            ArrayList<Integer> arr = new ArrayList<>();
            while (temp != null) {
                arr.add(temp.data);
                temp = temp.next;
            }
            int i = 0, j = arr.size() - 1;
            while (i <= j) {
                int a = arr.get(i);
                int b = arr.get(j);
                if (a != b) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
}