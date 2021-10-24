// https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array

class Solution {
    int maxi;
    int maxj;
    public int findMaximumXOR(int[] nums) {
        maxi=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max)
                maxi=nums[i];
        }
        for(int j=1;j<nums.length;j++){
            maxj=maxi^nums[0];
            if(nums[j]==maxi)
                continue;
            if((maxi^nums[j])>maxj){
                maxj=maxi^nums[j];
            }
        }
        return maxj;
    }
}