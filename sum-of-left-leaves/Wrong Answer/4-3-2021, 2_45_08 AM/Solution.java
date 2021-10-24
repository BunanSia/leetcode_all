// https://leetcode.com/problems/sum-of-left-leaves

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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {       
        if(root==null)
            return 0;
        else if(root.left==null)
            sumOfLeftLeaves(root.right);
        else if(root.left!=null&&root.left.left==null){
            sum+=root.left.val;
            sumOfLeftLeaves(root.right);
            return sum;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }
}