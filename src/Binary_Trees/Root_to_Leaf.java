package L43_L44_L45_L46_L47_Binary_Trees;

import java.util.ArrayList;

public class Root_to_Leaf {

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
        public static ArrayList<ArrayList<Integer>> Paths(Node root) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> arr = new ArrayList<>();
            dfs(root,arr,ans);
            return ans;
        }

        private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
            if (root == null){
                return;
            }
            arr.add(root.data);
            if(root.left == null && root.right == null){
                ArrayList<Integer> list = new ArrayList<>();
                list.addAll(arr);
                ans.add(list);
            }
            dfs(root.left,arr,ans);
            dfs(root.right,arr,ans);
            arr.remove(arr.size()-1);  // Backtracking
        }
    }
}
