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
   public static int ans=0;
    public static int count=0;
    public int kthSmallest(TreeNode root, int k) {
        // it is without extra space
        ans=0;
        count=0;
        Inorder(root,k);
        return ans;
    }
    public static void Inorder(TreeNode root,int k){
        if(root==null) return;
        Inorder(root.left,k);
        count++;
        if(count==k){
            ans=ans+root.val;
            return;
        }
        Inorder(root.right,k);
    }
}