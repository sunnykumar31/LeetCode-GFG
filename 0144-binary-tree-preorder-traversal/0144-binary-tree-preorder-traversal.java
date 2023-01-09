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
    // public static void preoder(TreeNode root,List<Integer> list){
    //     if(root==null){
    //         return;
    //     }
    //     list.add(root.val);
    //     preoder(root.left,list);
    //     preoder(root.right,list);
    // }
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> list=new ArrayList<>();
    //     preoder(root,list);
    //     return list;
    // }
    
    
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root){
        if(root==null){
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}