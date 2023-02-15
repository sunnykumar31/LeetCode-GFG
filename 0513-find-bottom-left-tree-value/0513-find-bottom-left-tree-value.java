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
    public int findBottomLeftValue(TreeNode root) {
        return levelOrder(root);
    }
    public static int levelOrder(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> qh=new LinkedList<>();
        List<Integer> list =new ArrayList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            list.add(temp.val);
            if(temp.left!=null){
                qh.add(temp.left);
            }
            if(temp.right!=null){
                qh.add(temp.right);
            }
            if(q.isEmpty()){
                ans=list.get(0);
                q=qh;
                qh=new LinkedList<>();
                list=new ArrayList<>();
            }
        }
        return ans;
    }
}