package L43_L44_L45_L46_L47_Binary_Trees;

public class Lowest_Common_Ancestor {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

//    class Solution {
//        Node lca(Node root, int p, int q) {
//            if (root == null){
//                return null;
//            }
//            if (root.data == p || root.data == q) {
//                return root;
//            }
//            boolean pLiesInLeft = exists(root.left,p);
//            boolean qLiesInRight = exists(root.right,q);
//            if (pLiesInLeft && !qLiesInRight){  // Both lies in Left
//                return lca(root.left, p, q);
//            }
//            else if (!pLiesInLeft && qLiesInRight){  // Both lies in Right
//                return lca(root.right, p, q);
//            }
//            else {
//                return root;
//            }
//        }
//
//        private boolean exists(Node root, int val) {
//            if (root == null){
//                return false;
//            }
//            if (root.data == val){
//                return true;
//            }
//            return exists(root.left,val) || exists(root.right,val);
//        }
//    }

    class Solution {
        Node lca(Node root, int p, int q) {
            if (root == null){
                return null;
            }
            if (root.data == p || root.data == q) {
                return root;
            }
            Node l = lca(root.left,p,q);
            Node r = lca(root.right,p,q);
            if(l!=null && r!=null){
                return root;
            }
            return (l==null) ? r : l;
        }
    }
}
