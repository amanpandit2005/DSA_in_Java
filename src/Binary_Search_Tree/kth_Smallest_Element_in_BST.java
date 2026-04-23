package Binary_Search_Tree;

import java.util.ArrayList;

public class kth_Smallest_Element_in_BST {
    class Node {
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    class Solution {
        public void inorder(Node root, ArrayList<Integer> arr){
            if(root==null){
                return;
            }
            inorder(root.left,arr);
            arr.add(root.data);
            inorder(root.right,arr);
        }
        public int kthSmallest(Node root, int k) {
            ArrayList<Integer> arr = new ArrayList<>();
            inorder(root,arr);
            if(arr.size()<k){
                return -1;
            }
            return arr.get(k-1);
        }
    }

//    class Solution {
//        static int ans;
//        static int k2;
//        public void inorder(Node root){
//            if(root==null){
//                return;
//            }
//            inorder(root.left);
//            k2--;
//            if(k2==0){
//                ans = root.data;
//            }
//            inorder(root.right);
//        }
//        public int kthSmallest(Node root, int k) {
//            k2 = k;
//            ans = -1;
//            inorder(root);
//            return ans;
//        }
//    }
}
