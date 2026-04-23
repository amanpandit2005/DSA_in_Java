package Binary_Search_Tree;

public class Maximum_and_Minimum_Elements_in_BST {
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
        public int maxValue(Node root) {
            Node temp = root;
            while(temp.right!=null){
                temp=temp.right;
            }
            return temp.data;
        }

        public int minValue(Node root) {
            Node temp = root;
            while (temp.left != null) {
                temp = temp.left;
            }
            return temp.data;
        }
    }
}
