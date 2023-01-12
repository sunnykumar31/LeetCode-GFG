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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        hasPathSum(root,targetSum,ans,res);
        return res;
    }
    public void hasPathSum(TreeNode root, int targetSum,List<Integer> ans,List<List<Integer>> res) {
        if(root==null) return;
         ans.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val-targetSum==0){;
                res.add(new ArrayList<>(ans));
            }
            // return;
                
        }
       
        hasPathSum(root.left,targetSum-root.val,ans,res);
        hasPathSum(root.right,targetSum-root.val,ans,res);
        ans.remove(ans.size()-1);
    }
}