package L30_L31_L32_L33_L34_L35_L36_LinkedList;

import java.util.Objects;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtIndex(int idx, int val) {
        ListNode a = new ListNode(val);
        if (idx<0 || idx>size) {
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        ListNode temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;
    }
    void deleteAtHead(){
        if(size == 0){
            System.out.println("List is Empty");
            return;
        }
        if(size == 1){
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }void deleteAtTail(){
        if(size == 0){
            System.out.println("List is Empty");
            return;
        }
        if(size == 1){
            head = tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
public class Doubly_LinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtTail(160);
        list.insertAtTail(100);
        list.insertAtHead(140);
        list.insertAtTail(110);
        list.display();
        list.displayReverse();
        list.deleteAtHead();
        list.deleteAtTail();
        list.deleteAtHead();
        list.deleteAtTail();
        list.display();
        list.displayReverse();
        list.insertAtIndex(2,65);
        list.insertAtIndex(1,55);
        list.display();
        list.displayReverse();
    }
}
