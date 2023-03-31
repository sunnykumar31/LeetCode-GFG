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
class Diapair{
    int d=0;
    int ht=-1;
}
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return find(root).d;
    }
    public Diapair find(TreeNode root){
        if(root==null){
            return new Diapair();
        }
        Diapair ldp=find(root.left);
        Diapair rdp=find(root.right);
        Diapair sdp=new Diapair();
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        int dim=ldp.ht+rdp.ht+2;
        sdp.d=Math.max(dim,Math.max(ldp.d,rdp.d));
        return sdp;
    }
}