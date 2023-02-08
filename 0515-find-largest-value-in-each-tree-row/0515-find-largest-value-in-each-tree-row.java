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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        DFS(root,list);
        return list;
    }
    public static void DFS(TreeNode root,List<Integer> list){
        
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> qh=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        q.add(root);
        if(root==null){
            return;
        }
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            ans.add(temp.val);
            if(temp.left!=null){
                qh.add(temp.left);
            }
            if(temp.right!=null){
                qh.add(temp.right);
            }
            if(q.isEmpty()){
                list.add(Collections.max(ans));
                q=qh;
                qh=new LinkedList<>();
                ans=new ArrayList<>();
            }
        }
        return;
    }
}