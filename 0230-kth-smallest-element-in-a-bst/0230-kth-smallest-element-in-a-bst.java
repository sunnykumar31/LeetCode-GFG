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
    public int kthSmallest(TreeNode root, int k) {
        //bt it take O(n) space complexity
        List<Integer> list=new ArrayList<>();
        Inorder(root,list);
        return list.get(k-1);
    }
    public static void Inorder(TreeNode root,List<Integer> list){
        if(root==null) return;
        Inorder(root.left,list);
        list.add(root.val);
        Inorder(root.right,list);
    }
}