package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.Collections;

public class BST_to_GST {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    class Solution {
        public static void inorder(Node root, ArrayList<Node> arr){
            if(root==null){
                return;
            }
            inorder(root.left,arr);
            arr.add(root);
            inorder(root.right,arr);
        }
        public static void transformTree(Node root) {
            ArrayList<Node> arr = new ArrayList<>();
            inorder(root,arr);
            Collections.reverse(arr);
            int sum = 0;
            for(int i=0;i<arr.size();i++){
                int val = arr.get(i).data;
                arr.get(i).data = sum;
                sum += val;
            }
        }
    }

//    class Solution {
//        public static void revInorder(Node root, ArrayList<Node> arr){
//            if(root==null){
//                return;
//            }
//            revInorder(root.right,arr);
//            arr.add(root);
//            revInorder(root.left,arr);
//        }
//        public static void transformTree(Node root) {
//            ArrayList<Node> arr = new ArrayList<>();
//            revInorder(root,arr);
//            int sum = 0;
//            for(int i=0;i<arr.size();i++){
//                int val = arr.get(i).data;
//                arr.get(i).data = sum;
//                sum += val;
//            }
//        }
//    }

//    class Solution {
//        static int sum;
//        public static void revInorder(Node root){
//            if(root==null){
//                return;
//            }
//            revInorder(root.right);
//            int val = root.data;
//            root.data = sum;
//            sum  += val;
//            revInorder(root.left);
//        }
//        public static void transformTree(Node root) {
//            sum = 0;
//            revInorder(root);
//        }
//    }

}
