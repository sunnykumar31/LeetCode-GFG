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
    int count=0;
    public int minCameraCover(TreeNode root) {
        int c=countCamers(root);
        if(c==-1){
            count++;
        }
        return count;
        
    }
    public int countCamers(TreeNode root){
        if(root==null){
            return 1;
        }
        int left=countCamers(root.left);
        int right=countCamers(root.right);
        if(left==-1 || right==-1){
            count++;
            return 2;
        }
        if(left==1 && right==1){
            return -1;
        }
        else{
            return 1;
        }
    }
}