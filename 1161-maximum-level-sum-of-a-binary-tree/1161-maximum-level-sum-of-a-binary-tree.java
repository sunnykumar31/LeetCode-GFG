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
        int s=0;
        PriorityQueue<pair> pq=new PriorityQueue<>(new Comparator<pair>(){
            public int compare(pair o2,pair o1){
                return o1.sum-o2.sum;
            }
        });
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> qdub=new LinkedList<>();
        q.add(root);
        int l=0;
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            s+=temp.val;
            if(temp.left!=null){
                qdub.add(temp.left);
            }
            if(temp.right!=null){
                qdub.add(temp.right);
            }
            if(q.isEmpty()){
                l++;
                pair sl=new pair();
                sl.sum=s;
                sl.level=l;
                pq.add(sl);
                s=0;
                q=qdub;
                qdub=new LinkedList<>();
            }
        }
        return pq.peek().level;
    }
}