package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class Swapping_Nodes_in_LinkedList {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode swapNodes(ListNode head, int k) {
            ListNode fast=head;
            ListNode slow=head;
            for(int i=1;i<=k;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            fast=head;
            for(int i=1;i<=k-1;i++){
                fast=fast.next;
            }
            int temp=fast.val;
            fast.val=slow.val;
            slow.val=temp;
            return head;
        }
    }
}
