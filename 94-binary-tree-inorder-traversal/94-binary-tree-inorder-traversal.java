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
    // public static void inoder(TreeNode root,List<Integer> list){
    //     if(root==null){
    //         return;
    //     }
    //     inoder(root.left,list);
    //     list.add(root.val);
    //     inoder(root.right,list);
    // }
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> list=new ArrayList<>();
    //     inoder(root,list);
    //     return list;
    // }
    
    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        if(root==null){
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}