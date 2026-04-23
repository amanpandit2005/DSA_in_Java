package L30_L31_L32_L33_L34_L35_L36_LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class Linkedlist{
    Node head;
    Node tail;
    int size;
    void addAtHead(int value){
        Node temp = new Node(value);
        if (head == null){
            head = tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int value){
//        Node temp = new Node(value);
        if (tail==null){
//            head = tail = temp;
            addAtHead(value);
            return;
        }
        else {
            Node temp = new Node(value);
            tail.next = temp;
            tail = temp;
            size++;
        }
//        size++;
    }
    void deleteAtHead(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if (head==null){
            tail = null;
        }
        size--;
    }
    int search(int value){
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int index = 0;
        while (temp != null){
            if (temp.val == value){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    void insertAtIndex(int idx, int value){
        if (idx<0 || idx>size){
            System.out.println("Cannot Add");
            return;
        }
        if (idx==0){
            addAtHead(value);
        }
        else if (idx==size) {
            addAtTail(value);
        }
        else{
            Node temp = head;
            for (int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(value);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    int DisplayAtIndex(int idx) {
        Node temp = head;
        for (int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void deleteAtIndex(int idx){
        if (idx<0 || idx>size){
            System.out.println("Cannot Delete! Invalid Index");
            return;
        }
        if (idx == 0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for (int i=0;i<idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (idx == size-1){
            tail = temp;
        }
        size--;
    }
    void display() {
        if(head==null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedList_Data_Structure {
    public static void main(String[] args) {
        Linkedlist ll =new Linkedlist();
        ll.addAtTail(1);
        ll.addAtTail(2);
        ll.addAtTail(3);
        ll.display();
        ll.addAtTail(4);
        ll.addAtTail(5);
        ll.addAtHead(6);
        ll.addAtHead(7);
        ll.addAtHead(8);
        ll.display();
        System.out.println(ll.size);
        ll.deleteAtHead();
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.search(90));
        ll.insertAtIndex(3,55);
        ll.display();
        ll.insertAtIndex(0,10);
        ll.insertAtIndex(8,100);
        ll.display();
        System.out.println(ll.DisplayAtIndex(4));
        ll.deleteAtIndex(4);
        ll.deleteAtIndex(0);
        ll.deleteAtIndex(6);
        ll.display();
    }
}
