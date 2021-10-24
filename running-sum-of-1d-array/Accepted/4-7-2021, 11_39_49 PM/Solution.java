// https://leetcode.com/problems/running-sum-of-1d-array

class Solution {
    int result[];

    public int[] runningSum(int[] nums) {
        int sum=0;
        result= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            result[i]=sum;
        }
        return result;  
    }
}