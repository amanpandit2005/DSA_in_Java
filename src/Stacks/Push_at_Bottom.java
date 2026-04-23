package L37_L38_L39_L40_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Push_at_Bottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to add at bottom: ");
        int ele = sc.nextInt();
        pushAtBottom(st, ele);
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
}
