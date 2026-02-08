package L43_L44_L45_L46_L47_Binary_Trees;

import java.util.ArrayList;

public class Right_View_of_Binary_Tree {
    class Node {
        int data;
        Node left, right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    class Solution {
        public ArrayList<Integer> rightView(Node root) {
            ArrayList<Integer> ans = new ArrayList<>();
            view(root,0,ans);
            return ans;
        }
        private void view(Node root, int level, ArrayList<Integer> ans) {
            if (root == null) {
                return;
            }
            if (level >= ans.size()) {
                ans.add(root.data);
            }
            else {
                ans.set(level, root.data);
            }
            view(root.left, level + 1, ans);
            view(root.right, level + 1, ans);
        }
    }
}
