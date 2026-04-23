package Binary_Search_Tree;

public class Validate_BST {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

//        class Pair{
//        int max;
//        int min;
//        Pair(int max, int min){
//            this.max = max;
//            this.min = min;
//        }
//    }

//    class Triplet {
//        int max;
//        int min;
//        boolean isBST;
//        Triplet(int max, int min, boolean isBST) {
//            this.max = max;
//            this.min = min;
//            this.isBST = isBST;
//        }
//    }

//    class Solution {
//        boolean isBST(Node root) {
//            return maxMin(root).isBST;
//        }
//
//        Triplet maxMin(Node root) {
//            if (root == null) {
//                return new Triplet(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
//            }
//            Triplet lst = maxMin(root.left);
//            Triplet rst = maxMin(root.right);
//            int max = Math.max(root.data, Math.max(lst.max, rst.max));
//            int min = Math.min(root.data, Math.min(lst.min, rst.min));
//            boolean isBST = lst.isBST && rst.isBST && (lst.max < root.data) && (rst.min > root.data);
//
//            return new Triplet(max, min, isBST);
//        }
//    }
//}

//    class Solution {
//        static boolean flag;
//        public boolean isBST(Node root) {
//            flag = true;
//            maxMin(root);
//            return flag;
//        }
//        Pair maxMin(Node root){
//            if(root==null){
//                return new Pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
//            }
//            Pair lst = maxMin(root.left);
//            Pair rst = maxMin(root.right);
//            int max = Math.max(root.data,Math.max(lst.max,rst.max));
//            int min = Math.min(root.data,Math.min(lst.min,rst.min));
//            if(lst.max>=root.data || rst.min<=root.data){
//                flag = false;
//            }
//            return new Pair(max,min);
//        }
//    }
//}

    class Solution {  // Code using Morris Traversal
        boolean isBST(Node root) {
            Node curr = root;
            int prev = 0;
            while (curr != null) {
                if (curr.left != null) {
                    // Find Predecessor and Do Work
                    Node pred = curr.left;
                    while (pred.right != null && pred.right != curr) {
                        pred = pred.right;
                    }
                    if (pred.right == null) {
                        pred.right = curr;
                        curr = curr.left;
                    } else {
                        pred.right = null;
                        if (curr.data <= prev) {
                            return false;
                        }
                        prev = curr.data;
                        curr = curr.right;
                    }
                } else {
                    if (curr.data <= prev) {
                        return false;
                    }
                    prev = curr.data;
                    curr = curr.right;
                }
            }
            return true;
        }
    }
}
