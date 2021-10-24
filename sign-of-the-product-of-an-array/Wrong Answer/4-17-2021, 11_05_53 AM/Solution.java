// https://leetcode.com/problems/sign-of-the-product-of-an-array

class Solution {
    public int arraySign(int[] nums) {
        int product=1;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
        }
        int result;
        result=signFunc(product);
        return result;
    }
    public int signFunc(int n){
        if(n>0)
            return 1;
        else if(n==0)
            return 0;
        else
            return -1;
    }
}