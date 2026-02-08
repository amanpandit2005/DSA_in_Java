package L37_L38_L39_L40_Stacks;

import java.util.Stack;

public class Reverse_Stack_Recursively {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void pushAtBottom(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, ele);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()<=1){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
}
