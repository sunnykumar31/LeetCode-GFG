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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        DFS(root,res);
        Collections.reverse(res);
        return res;
    }
    public static void DFS(TreeNode root,List<List<Integer>> res){
        
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
                res.add(ans);
                q=qh;
                qh=new LinkedList<>();
                ans=new ArrayList<>();
            }
        }
        return;
    }
}