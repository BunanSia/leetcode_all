// https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array

class Solution {
    int maxi;
    int maxj;
    public int findMaximumXOR(int[] nums) {
        maxi=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>maxi)
                maxi=nums[i];
        }
        maxj=maxi^nums[0];
        for(int j=1;j<nums.length;j++){

            if(nums[j]==maxi)
                continue;
            if((maxi^nums[j])>maxj){
                maxj=maxi^nums[j];
            }
        }
        return maxj;
    }
}