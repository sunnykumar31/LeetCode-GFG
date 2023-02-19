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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        DFS(root,res);
        return res;
    }
    public static void DFS(TreeNode root,List<List<Integer>> res){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        q.add(root);
        int s=q.size();
        int f=0;
        while(!q.isEmpty()){
            s=q.size();
            for(int i=0;i<s;i++){
                TreeNode temp=q.remove();
                list.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            if(f==1) {
                Collections.reverse(list);
                f=0;
            }
            else{
                f=1;
            }
            res.add(list);
            list=new ArrayList<>();
        }
        return;
    }
}