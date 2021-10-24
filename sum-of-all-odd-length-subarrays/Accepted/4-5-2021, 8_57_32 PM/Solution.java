// https://leetcode.com/problems/sum-of-all-odd-length-subarrays

class Solution {
    int sum=0;
    public int sumOddLengthSubarrays(int[] arr) {
        int l=arr.length;
        for(int i=0;i<l;i++)
            sum+=arr[i]*(((l-i)*(i+1)+1)/2);
        return sum;
    }
}