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
    public long kthLargestLevelSum(TreeNode root, int k) {
        long sum=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> qdub=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            sum+=temp.val;
            if(temp.left!=null){
                qdub.add(temp.left);
            }
            if(temp.right!=null){
                qdub.add(temp.right);
            }
            if(q.isEmpty()){
                // System.out.println(sum);
                if(pq.size()<k){
                    pq.add(sum);
                }
                else if(pq.peek()<sum){
                    pq.poll();
                    pq.add(sum);
                } 
                sum=0;
                q=qdub;
                qdub=new LinkedList<>();
                level++;
            }
        }
        // System.out.println(pq);
        if(level<k) return -1;
        return pq.peek();
    }
}