// https://leetcode.com/problems/minimum-depth-of-binary-tree

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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        else if(root.left==null||root.right==null){
            if(root.left==null)
                return minDepth(root.right)+1;
            else
                return minDepth(root.left)+1;
        }
        else{
            int l=minDepth(root.left)+1;
            int r=minDepth(root.right)+1;
            if(r<l)
                return r;
            else
                return l;
        }
    }
}