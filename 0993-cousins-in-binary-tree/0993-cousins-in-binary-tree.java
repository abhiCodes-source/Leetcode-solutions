/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    TreeNode x_parent = null;
    TreeNode y_parent = null;
    int x_length = -1;
    int y_length = -1;
    public void dfs(TreeNode root, int x, int y, TreeNode parent, int depth) {
        if (root == null) return;
        if (root.val == x) {
            x_parent = parent;
            x_length = depth;
        }
        if (root.val == y) {
            y_parent = parent;
            y_length = depth;
        }
        dfs(root.left, x, y, root, depth + 1);
        dfs(root.right, x, y, root, depth + 1);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        dfs(root, x, y, null, 0);
        if (x_length != y_length) return false;
        if (x_parent == y_parent) return false;
        return true;
    }
}