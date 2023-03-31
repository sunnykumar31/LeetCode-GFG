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
class pair{
    boolean bl=true;
    int ht=-1;
}
class Solution {
    public boolean isBalanced(TreeNode root) {
        return find(root).bl;
    }
    public pair find(TreeNode root){
        if(root==null){
            return new pair();
        }
        pair lp=find(root.left);
        pair rp=find(root.right);
        pair prsnt=new pair();
        prsnt.ht=Math.max(lp.ht,rp.ht)+1;
        int blce=Math.abs(lp.ht-rp.ht);
        prsnt.bl=lp.bl && rp.bl && blce<=1;
        return prsnt;
    }
}