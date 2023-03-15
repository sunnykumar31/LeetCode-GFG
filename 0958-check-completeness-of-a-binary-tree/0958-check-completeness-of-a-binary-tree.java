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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(true){
            TreeNode temp=q.remove();
            if(temp.left==null){
                if(temp.right!=null){
                    return false;
                }
                break;
            }
            q.add(temp.left);
            if(temp.right==null){
                break;
            }
            q.add(temp.right);
        }
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            if(temp.left!=null || temp.right!=null){
                return false;
            } 
        }
        return true;
    }
}