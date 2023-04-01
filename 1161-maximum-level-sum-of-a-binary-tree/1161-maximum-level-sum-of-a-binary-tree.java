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
    int sum;
    int level;
}
class Solution {
    public int maxLevelSum(TreeNode root) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int level=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.remove();
                sum+=temp.val;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            l++;
            if(sum>max){
                max=sum;
                level=l;
            }
            sum=0;
        }
        return level;
    }
}