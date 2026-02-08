package L43_L44_L45_L46_L47_Binary_Trees;

public class Diameter_of_Binary_Tree {
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

// class Solution {  // Worst Time Complexity
//     public int diameter(Node root) {
//         if(root == null){
//             return 0;
//         }
//         int a = levels(root.left) + levels(root.right);
//         int b = diameter(root.left);
//         int c = diameter(root.right);
//         return Math.max(a,Math.max(b,c));

//     }
//     int levels(Node root) {
//         if(root == null){
//             return 0;
//         }
//         return 1 + Math.max(levels(root.left), levels(root.right));
//     }
// }

    class Solution { // Best Time Complexity
        static int max;
        public int diameter(Node root) {
            max = 0;
            levels(root);
            if(root == null){
                return 0;
            }

            return max;

        }
        int levels(Node root) {
            if(root == null){
                return 0;
            }
            int leftLevels = levels(root.left);
            int rightLevels = levels(root.right);
            int dia = leftLevels + rightLevels;
            max = Math.max(max,dia);
            return 1 + Math.max(leftLevels, rightLevels);
        }
    }
}
