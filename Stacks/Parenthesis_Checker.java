package L37_L38_L39_L40_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parenthesis's String: ");
        String s = sc.nextLine();
        System.out.print("Balanced: ");
        System.out.println(isBalanced(s));
    }
    static boolean isBalanced(String s){
        int n = s.length();
        if(n%2==1){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                char top = st.peek();
                if(sameStyle(top,ch)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return (st.size()==0);
    }
    static boolean sameStyle(char a, char b){
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        return false;
    }
}

