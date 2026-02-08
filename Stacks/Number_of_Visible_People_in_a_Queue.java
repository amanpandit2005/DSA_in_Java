package L37_L38_L39_L40_Stacks;

import java.util.Stack;

public class Number_of_Visible_People_in_a_Queue {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            int count = 0;
            while(st.size()>0 && st.peek()<=arr[i]){
                count++;
                st.pop();
            }
            if(st.size()>0) count++;  // Very Important Line.
            ans[i] = count;
            st.push(arr[i]);
        }
        return ans;
    }
}
