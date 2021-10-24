// https://leetcode.com/problems/range-sum-of-bst

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
    public int array(TreeNode root,int low,int high,int result){
        if(root==null)
            return result;
        else if(root.val>=low&&root.val<=high)
            result+=root.val;
        int leftresult=array(root.left,low,high,result);
        int rightresult=array(root.right,low,high,leftresult);   
        return rightresult;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int result=0;
        result=array(root,low,high,result);
        return result;
    }
}