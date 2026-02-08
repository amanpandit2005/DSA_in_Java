package L41_L42_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_a_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        reverseQueue(q);
        System.out.println(q);
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()){
            st.push(q.remove());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        return q;
    }
}
