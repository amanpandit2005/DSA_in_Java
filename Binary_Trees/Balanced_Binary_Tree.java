package L43_L44_L45_L46_L47_Binary_Trees;

public class Balanced_Binary_Tree {
    class Node {
        int data;
        Node left, right;

        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
//    class Solution {   // Worst Time Complexity
//        public boolean isBalanced(Node root) {
//            if(root==null){
//                return true;
//            }
//            int leftLevels = levels(root.left);
//            int rightLevels = levels(root.right);
//            if(Math.abs(leftLevels-rightLevels)>1){
//                return false;
//            }
//            return isBalanced(root.left) && isBalanced(root.right);
//        }
//        private int levels(Node root) {
//            if(root == null){
//                return 0;
//            }
//            return 1 + Math.max(levels(root.left), levels(root.right));
//        }
//    }

    class Solution {  // Best Time Complexity
        static boolean flag;
        public boolean isBalanced(Node root) {
            if(root==null){
                return true;
            }
            flag = true;
            levels(root);
            return flag;
        }
        private int levels(Node root) {
            if(root == null){
                return 0;
            }
            int leftLevels = levels(root.left);
            int rightLevels = levels(root.right);
            if(Math.abs(leftLevels-rightLevels)>1){
                flag = false;
            }
            return 1 + Math.max(leftLevels, rightLevels);
        }
    }
}
