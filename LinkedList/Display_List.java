package L30_L31_L32_L33_L34_L35_L36_LinkedList;

import java.util.Scanner;

//class Node {
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//    }
//}
public class Display_List {
    public static void display(Node head) {
//        System.out.print(head.val+" ");
//        System.out.print(head.next.val+" ");
//        System.out.print(head.next.next.val+" ");
//        System.out.print(head.next.next.next.val+" ");
//        System.out.print(head.next.next.next.next.val+" ");
//        System.out.print(head.next.next.next.next.next.val);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();

//        for (Node temp = head; temp != null; temp = temp.next){
//            System.out.print(temp.val+" ");
//        }
//        System.out.println();
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node a = new Node(sc.nextInt());
        // 10->20->30->40->50
        Node a = new Node(10); // Head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        // Connecting/Linking
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);

    }
}
