package Binary_Search_Tree;

import java.util.ArrayList;

public class Morris_Inorder_Traversal {
    class Node {
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }

    class Solution {

        // Time Complexity = O(n)
        // Space Complexity = O(1)

        public ArrayList<Integer> inOrder(Node root) {

            ArrayList<Integer> ans = new ArrayList<>();
            Node curr = root;
            while(curr != null){
                if(curr.left != null){
                    // Find Predecessor and Do Work
                    Node pred = curr.left;
                    while(pred.right != null && pred.right != curr){
                        pred = pred.right;
                    }
                    if(pred.right == null){  // Link
                        pred.right = curr;
                        curr = curr.left;
                    }
                    else{  // pred.right = curr , Unlink & Print
                        pred.right = null;
                        ans.add(curr.data);
                        curr = curr.right;
                    }
                }
                else{
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            return ans;
        }
    }
}
