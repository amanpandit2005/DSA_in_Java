package L41_L42_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Addition_in_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        for (int i=1;i<=q.size();i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
        AddAtIndex(q,3,100);
        for (int i=1;i<=q.size();i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
    }
    public static void AddAtIndex(Queue<Integer> q, int index, int element){
        if (index<0 && index>q.size()){
            System.out.println("Invalid Index");
            return;
        }
        int n = q.size();
        for (int i=1;i<=index;i++){
            q.add(q.remove());
        }
        q.add(element);
        for (int i=1;i<=n-index;i++){
            q.add(q.remove());
        }
    }
}
