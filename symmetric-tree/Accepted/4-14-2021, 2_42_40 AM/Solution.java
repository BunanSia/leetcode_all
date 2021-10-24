// https://leetcode.com/problems/symmetric-tree

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
    boolean result=false;
    boolean goNextresult=false;
    public boolean goNext(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        else if(left==null||right==null)
            return false;
        else if(left.val==right.val){
            goNextresult=goNext(left.right,right.left)&&goNext(left.left,right.right);
        }
        else 
            goNextresult=false;
            return goNextresult;}
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
            result=goNext(root.left,root.right);
        return result;
    }
}