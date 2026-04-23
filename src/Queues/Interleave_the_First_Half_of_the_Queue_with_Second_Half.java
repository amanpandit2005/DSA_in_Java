package L41_L42_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Interleave_the_First_Half_of_the_Queue_with_Second_Half {
    class Solution {
        public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
            Stack<Integer> st = new Stack<>();
            int n = q.size();
            for (int i = 1; i <= n / 2; i++) {
                st.push(q.remove());
            }
            while (st.size() > 0) {
                q.add(st.pop());
            }
            for (int i = 1; i <= n / 2; i++) {
                st.push(q.remove());
            }
            // Rearrangement
            while (st.size() > 0) {
                q.add(st.pop());
                q.add(q.remove());
            }
            // Reverse the q
            while (q.size() > 0) {
                st.push(q.remove());
            }
            while (st.size() > 0) {
                q.add(st.pop());
            }
            return q;
        }
    }
}
//    class Solution {
//        public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
//            Queue<Integer> q2 = new LinkedList<>();
//            int n = q.size();
//            for(int i=1;i<=n/2;i++){
//                q2.add(q.remove());
//            }
//            while(q2.size()>0){
//                q.add(q2.remove());
//                q.add(q.remove());
//            }
//            return q;
//        }
//    }
//}
