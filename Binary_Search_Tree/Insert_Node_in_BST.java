package Binary_Search_Tree;

public class Insert_Node_in_BST {
    class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    class Solution {
        void attach(Node root, int key){
            if(root==null){
                return;
            }
            if(root.data<key){
                if(root.right==null){
                    root.right=new Node(key);
                }
                else{
                    attach(root.right,key);
                }
            }
            else{
                if(root.left==null){
                    root.left=new Node(key);
                }
                else{
                    attach(root.left,key);
                }
            }
        }
        Node insert(Node root, int key){
            attach(root, key);
            return root;
        }
    }

//    class Solution {
//        Node insert(Node root, int key){
//            if(root==null){
//                return new Node(key);
//            }
//            if(root.data==key){
//                return root;
//            }
//            else if(root.data<key){
//                root.right=insert(root.right,key);
//            }
//            else{
//                root.left=insert(root.left,key);
//            }
//            return root;
//        }
//    }

//    class Solution {
//        Node insert(Node root, int key){
//            if(root==null){
//                return new Node(key);
//            }
//            if(root.data<key){  // RST me attach ke k aao
//                root.right=insert(root.right,key);
//            }
//            else{  // LST me attach kr k aao
//                root.left=insert(root.left,key);
//            }
//            return root;
//        }
//    }
}
