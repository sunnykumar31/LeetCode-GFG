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
    public int count=0;
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        countAvg(root);
        return count;
    }
    public int[] countAvg(TreeNode root){
        if(root==null){
            return new int[] {0,0};
        }
        int[] l=countAvg(root.left);
        int[] r=countAvg(root.right);
        int sum=l[0]+r[0]+root.val;
        int n=l[1]+r[1]+1;
        // System.out.println(sum+" "+n);
        if((sum/(n))==root.val) count++;
        return new int[] {sum,n};
    }
}