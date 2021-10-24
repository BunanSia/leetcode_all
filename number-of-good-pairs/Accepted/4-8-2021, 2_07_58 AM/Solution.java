// https://leetcode.com/problems/number-of-good-pairs

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] record=new int[101];
        for(int i=0;i<nums.length;i++)
            record[nums[i]]++;
        int sum=0;
        for(int i=0;i<101;i++){
            if(record[i]!=0)
                sum+=(record[i]*(record[i]-1))/2;
        }
        return sum;
    }
}