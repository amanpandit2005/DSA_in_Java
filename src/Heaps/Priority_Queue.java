package Heaps;

import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        // MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(-30);
        pq.add(40);
        pq.add(50);
        System.out.println(pq.peek());
    }
}
