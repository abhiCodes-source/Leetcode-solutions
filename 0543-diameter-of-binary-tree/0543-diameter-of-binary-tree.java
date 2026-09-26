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
    public int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.right),height(root.left));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int leftans=diameterOfBinaryTree(root.left);
        int rightans=diameterOfBinaryTree(root.right);
        int lefthelp=height(root.left);
        int righthelp=height(root.right);
        if(root.left!=null) lefthelp++;
        if(root.right!=null) righthelp++;
        return Math.max(lefthelp+righthelp,Math.max(leftans,rightans));
    }
}