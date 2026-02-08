package L30_L31_L32_L33_L34_L35_L36_LinkedList;

//class Node {
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//    }
//}
public class Recursive_List_Display {
    public static void RecDisplay(Node head) {
        if (head == null){
            return;
        }
        System.out.print(head.val+" "); //Forward
        RecDisplay(head.next);
//        System.out.print(head.val+" "); //Reverse
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

        RecDisplay(a);

    }
}