// https://leetcode.com/problems/sum-of-unique-elements

class Solution {
    int sum=0;
    int[] uni=new int[101];
    public int sumOfUnique(int[] nums) {
        for(int i=0;i<nums.length;i++)
            uni[nums[i]]++;
        for(int i=0;i<101;i++){
            if(uni[i]==1)
                sum+=i;
        }
        return sum;
    }
}