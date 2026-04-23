package L37_L38_L39_L40_Stacks;

import java.util.Stack;

public class Basics_of_Stacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
        st.push("Aman");
        st.push("Kalash");
        st.push("Avdesh");
        st.push("Shashwat");
        st.push("Priyansh");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop()); // Returns the topmost element and then removes it.
        String s = st.pop();
        System.out.println(s);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
    }
}
