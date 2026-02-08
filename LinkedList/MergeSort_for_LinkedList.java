package L30_L31_L32_L33_L34_L35_L36_LinkedList;

public class MergeSort_for_LinkedList {
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}


    class Solution {
        public Node mergeSort(Node head1) {
            if(head1.next==null){
                return head1;
            }
            Node slow = head1;
            Node fast = head1;
            while(fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node head2=slow.next;
            slow.next=null;
            head1=mergeSort(head1);
            head2=mergeSort(head2);
            return merge(head1,head2);
        }
        Node merge(Node head1, Node head2) {
            Node i=head1;
            Node j=head2;
            Node dummy=new Node(-1);
            Node k=dummy;
            while(i!=null && j!=null){
                if(i.data<=j.data){
                    k.next=i;
                    i=i.next;
                }
                else{
                    k.next=j;
                    j=j.next;
                }
                k=k.next;
            }
            if(i==null){
                k.next=j;
            }
            else{
                k.next=i;
            }
            return dummy.next;
        }
    }
}
