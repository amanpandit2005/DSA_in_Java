package Binary_Trees;

import java.util.ArrayList;

public class Paths_from_Root_with_Specified_Sum {
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
        public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> arr = new ArrayList<>();
            dfs(root,arr,ans,sum);
            return ans;
        }

        private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, int sum) {
            arr.add(root.data);
            // If current path sum matches, add it
            if (sum == root.data) {
                ans.add(new ArrayList<>(arr));
            }
            // Continue searching children
            if (root.left != null) dfs(root.left, arr, ans, sum - root.data);
            if (root.right != null) dfs(root.right, arr, ans, sum - root.data);
            arr.remove(arr.size() - 1); // backtrack
        }
    }
}
