package L37_L38_L39_L40_Stacks;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;

    int peek() throws Exception{
        if(head==null){
            throw new Exception("Stack Underflow Error");
//            System.out.println("Stack is Empty");
//            return -1;
        }
       return head.val;
    }
    int pop() throws Exception {
        if(head==null) {
            throw new Exception("Stack Underflow Error");
//            System.out.println("Stack is Empty");
//            return -1;
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }
    void push(int ele){
        Node temp = new Node(ele);
        if(len==0){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Implementation_via_LinkedList {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        st.pop();
        System.out.println(st.peek());
        st.display();
        st.size();
        st.pop();
        st.pop();
        st.pop();
        st.display();
        st.pop();
    }
}
