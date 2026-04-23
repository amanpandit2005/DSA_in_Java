package Binary_Search_Tree;

public class MaxSum_BST_in_Binary_Tree {
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

    static class Pent {
        int max;
        int min;
        int size;
        int sum;
        boolean isBST;
        Pent(int max, int min, int size,int sum, boolean isBST) {
            this.max = max;
            this.min = min;
            this.size = size;
            this.sum = sum;
            this.isBST = isBST;
        }
    }

    class Solution {
        static int maxSum;
        public int maxSumBST(TreeNode root) {
            maxSum = 0;
            helper(root);
            return maxSum;
        }
        static Pent helper(TreeNode root) {
            if (root == null) {
                return new Pent(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0,true);
            }
            Pent lst = helper(root.left);
            Pent rst = helper(root.right);
            int max = Math.max(root.val, Math.max(lst.max, rst.max));
            int min = Math.min(root.val, Math.min(lst.min, rst.min));
            int size = 1 + lst.size + rst.size;
            int sum = root.val + lst.sum + rst.sum;
            boolean isBST = lst.isBST && rst.isBST && (lst.max < root.val) && (rst.min > root.val);
            if (isBST) maxSum = Math.max(sum,maxSum);
            return new Pent(max, min, size, sum, isBST);
        }
    }
}
