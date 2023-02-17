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
    public int min=Integer.MAX_VALUE;
    public TreeNode prev=null;
    public int minDiffInBST(TreeNode root) {
        findMin(root);
        return min;
    }
    public int findMin(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        findMin(root.left);
        if(prev!=null) min=Math.min(min,root.val-prev.val);
        prev=root;
        findMin(root.right);
        return min;
    }
}