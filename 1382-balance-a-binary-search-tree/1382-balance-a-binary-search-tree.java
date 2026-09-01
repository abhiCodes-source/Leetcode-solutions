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
    public TreeNode constructBST(List<Integer> arr,int i,int j){
        if(i>j) return null;
        int mid=(i+j)/2;
        TreeNode newnode=new TreeNode(arr.get(mid));
        newnode.left=constructBST(arr,i,mid-1);
        newnode.right=constructBST(arr,mid+1,j);
        return newnode;
    }
    public void inorder(TreeNode root,List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return constructBST(arr,0,arr.size()-1);
    }
}