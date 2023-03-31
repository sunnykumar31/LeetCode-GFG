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
    // int sum=0;
    public int sumNumbers(TreeNode root) {
        return find(root,0);
    }
    public int find(TreeNode root,int pathSum){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.val+pathSum*10;
        }
        int l=find(root.left,pathSum*10+root.val);
        int r=find(root.right,pathSum*10+root.val);
        return l+r;
    }
    
}