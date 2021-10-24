// https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array

class Solution {
    int max=0;
    int mask=0;

    public int findMaximumXOR(int[] nums) {

        for(int i=31;i>=0;i--){
            mask=mask|1<<i;
            Set<Integer>array=new HashSet();
            for(int num:nums)
                array.add(num&mask);
            int temp=max|(1<<i);
            for(int mem:array){
                if(array.contains(temp^mem)){
                    max=temp;
                    break;
                }
            }
        }
         return max;
    }
}