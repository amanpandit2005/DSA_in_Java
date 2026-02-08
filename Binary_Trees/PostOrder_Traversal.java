package L43_L44_L45_L46_L47_Binary_Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PostOrder_Traversal {
    class Node {
        int data;
        Node left, right;
        Node(int val){
            data = val;
            left = right = null;
        }
    }

// class Solution {
//     public void dfs(Node root,ArrayList<Integer> ans) {
//         if(root==null){
//             return;
//         }
//         dfs(root.left,ans);
//         dfs(root.right,ans);
//         ans.add(root.data);
//     }
//     public ArrayList<Integer> postOrder(Node root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         dfs(root,ans);
//         return ans;
//     }
// }

    class Solution {
        public ArrayList<Integer> postOrder(Node root) {
            ArrayList<Integer> ans = new ArrayList<>();
            Stack<Node> st = new Stack<>();
            st.push(root);
            while(st.size()>0){
                Node top = st.pop();
                ans.add(top.data);
                if(top.left!=null){
                    st.push(top.left);
                }
                if(top.right!=null){
                    st.push(top.right);
                }
            }
            Collections.reverse(ans);
            return ans;
        }
    }
}
