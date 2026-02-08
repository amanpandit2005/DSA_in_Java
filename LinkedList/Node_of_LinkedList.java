package L30_L31_L32_L33_L34_L35_L36_LinkedList;

//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val = val;
//    }
//}
public class Node_of_LinkedList {
    public static void main(String[] args) {
        // 10->20->30->40->50
        Node a = new Node(10); // Head
//        a.val = 10;
        Node b = new Node(20);
//        b.val = 20;
        Node c = new Node(30);
//        c.val = 30;
        Node d = new Node(40);
//        d.val = 40;
        Node e = new Node(50);
//        e.val = 50;

        // Connecting/Linking
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a);
        System.out.println(a.next);
        System.out.println(a.next.next);
        System.out.println(b);
        System.out.println(b.next);
        System.out.println(c);
        System.out.println(c.next);
        System.out.println(d);
        System.out.println(d.next);
        System.out.println(e);
        System.out.println(e.next);

        System.out.println(a.next.next.next.val);
    }
}
