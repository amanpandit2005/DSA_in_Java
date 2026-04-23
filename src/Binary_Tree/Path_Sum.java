package L43_L44_L45_L46_L47_Binary_Trees;

public class Path_Sum {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root==null){
                return false;
            }
            if(root.left==null && root.right==null){   // Finish the path at leaf
                if(targetSum==root.val){
                    return true;
                }
                else{
                    return false;
                }
            }
            return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
        }
    }
}
