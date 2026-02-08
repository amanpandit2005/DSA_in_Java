package L43_L44_L45_L46_L47_Binary_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node = node;
        this.level = level;
    }
}
public class Basics {
    public static void  main(String[] args) {

//                 1
//              /    \
//             2      3
//            / \    / \
//           4   5  6   7

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

//        for (int i=0;i<LevelOfBT(a);i++){   // O(n^2)
//            kThLvel(a,0,i);
//            System.out.println();
//        }

        System.out.print("PreOrder: ");
        preorderTraversal(a);

        System.out.println();

        System.out.print("InOrder: ");
        inorderTraversal(a);

        System.out.println();

        System.out.print("PostOrder: ");
        postorderTraversal(a);

        System.out.println();
        System.out.println("Size: "+size(a));
        System.out.println("Sum: "+sum(a));
        System.out.println("Product: "+product(a));
        System.out.println("Largest Element: "+findMax(a));
        System.out.println("Smallest Element: "+findMin(a));
        System.out.println("Level: "+LevelOfBT(a));
        System.out.print("LevelOrder: ");
        levelOrder(a);
        System.out.println("LevelOreder LineWise: ");
        levelOrderLineWise(a);
        System.out.println("Kth Level: ");
        kThLvel(a,0,1);
    }

    private static int LevelOfBT(Node root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(LevelOfBT(root.left), LevelOfBT(root.right));
    }

    private static int product(Node root) {
        if(root == null){
            return 1;
        }
        return root.val * product(root.left) * product(root.right);
    }

    private static int sum(Node root) {
        if(root == null){
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int size(Node root) {
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    private static int findMax(Node root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,Math.max(findMax(root.left),findMax(root.right)));
    }

    private static int findMin(Node root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(findMin(root.left),findMin(root.right)));
    }

    private static void preorderTraversal(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    private static void inorderTraversal(Node root) {
        if(root==null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }

    private static void postorderTraversal(Node root) {
        if(root==null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null){
                q.add(front.left);
            }
            if(front.right!=null){
                q.add(front.right);
            }
        }
        System.out.println();
    }

    public static void levelOrderLineWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currentLevel = 0;
        q.add(new Pair(root,0));
        while (q.size()>0){
            Pair front = q.remove();
            if (front.level!=currentLevel){ // Important
                currentLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null){
                q.add(new Pair(front.node.left,front.level+1));
            }
            if(front.node.right!=null){
                q.add(new Pair(front.node.right,front.level+1));
            }
        }
        System.out.println();
    }

    public static void kThLvel(Node root,int level,int k) {
        if (root == null){
            return;
        }
        if (level == k){
            System.out.print(root.val+" ");
        }
        kThLvel(root.left,level+1,k);
        kThLvel(root.right,level+1,k);
    }
}
