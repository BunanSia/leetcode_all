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
    int[] arr;
    List<Integer> list=new ArrayList<Integer>();
    public void array(TreeNode root){
        if(root!=null)
            list.add(root.val);
        else
            return;
        array(root.left);
        array(root.right);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        array(root);
        Collections.sort(list); 
        int indexstart=list.indexOf(low);
        int indexend=list.indexOf(high);
        int result=0;
        for(int i=indexstart;i<=indexend;i++){
            result+=list.get(i);
        }
        return result;
    }
}