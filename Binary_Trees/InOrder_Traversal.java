package L43_L44_L45_L46_L47_Binary_Trees;

import java.util.ArrayList;
import java.util.Stack;

public class InOrder_Traversal {
    class Node {
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }

// class Solution {
//     public void dfs(Node root,ArrayList<Integer> ans) {
//         if(root==null){
//             return;
//         }

//         dfs(root.left,ans);
//         ans.add(root.data);
//         dfs(root.right,ans);
//     }
//     public ArrayList<Integer> inOrder(Node root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         dfs(root,ans);
//         return ans;
//     }
// }


    class Solution {
        ArrayList<Integer> inOrder(Node root) { // Iterative
            ArrayList<Integer> ans = new ArrayList<>();
            Stack<Node> st = new Stack<>();
            Node curr = root;
            while(st.size()>0 || curr!=null){
                if(curr!=null){
                    if(curr.left!=null){
                        st.push(curr);
                        curr = curr.left;
                    }
                    else{
                        ans.add(curr.data);
                        curr = curr.right;
                    }
                }
                else{ // curr == null
                    Node top = st.pop();
                    ans.add(top.data);
                    curr = top.right;
                }
            }
            return ans;
        }
    }
}
