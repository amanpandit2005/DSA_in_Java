package L41_L42_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal_in_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int n = q.size();
        System.out.print("Queue Elements: ");
        for (int i=1;i<=n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
    }
}
