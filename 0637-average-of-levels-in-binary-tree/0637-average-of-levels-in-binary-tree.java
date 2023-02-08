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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> list=new ArrayList<>();
        DFS(root,list);
        return list;
    }
    public static void DFS(TreeNode root,List<Double> list){
        
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> qh=new LinkedList<>();
        q.add(root);
        double sum=0;
        int count=0;
        if(root==null){
            return;
        }
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            sum+=temp.val;
            count++;
            if(temp.left!=null){
                qh.add(temp.left);
            }
            if(temp.right!=null){
                qh.add(temp.right);
            }
            if(q.isEmpty()){
                list.add(sum/count);
                sum=0;
                count=0;
                q=qh;
                qh=new LinkedList<>();
            }
        }
        return;
    }
}