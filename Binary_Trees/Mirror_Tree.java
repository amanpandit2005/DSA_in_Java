package L43_L44_L45_L46_L47_Binary_Trees;

public class Mirror_Tree {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    class Solution {
        void mirror(Node root) {
            if(root==null){
                return;
            }
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirror(root.left);
            mirror(root.right);
        }
    }

//    class Solution {
//        void mirror(Node root) {
//            if(root==null){
//                return;
//            }
//            mirror(root.left);
//            Node temp = root.left;
//            root.left = root.right;
//            root.right = temp;
//            mirror(root.left);
//        }
//    }
//
//    class Solution {
//        void mirror(Node root) {
//            if(root==null){
//                return;
//            }
//            mirror(root.right);
//            Node temp = root.left;
//            root.left = root.right;
//            root.right = temp;
//            mirror(root.right);
//        }
//    }
}
