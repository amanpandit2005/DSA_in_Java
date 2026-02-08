package Binary_Search_Tree;

public class LCA_of_BST {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    class Solution {
        public Node LCA(Node root, Node p, Node q) {
            if(root.data > p.data && root.data > q.data){
                return LCA(root.left,p,q);
            }
            else if(root.data < p.data && root.data < q.data){
                return LCA(root.right,p,q);
            }
            else{
                return root;
            }
        }
    }
}
