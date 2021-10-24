// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            int length = (int) (Math.log10(nums[i]) + 1);
            if(length%2==0)
                result++;
        }
        return result;
    }
}