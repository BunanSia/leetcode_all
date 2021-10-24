// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

class Solution {

    List<Integer>result=new ArrayList<Integer>();

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] sorted;
        sorted=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sorted[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            sorted[temp-1]=temp;
        }
        for(int i=0;i<nums.length;i++){
            if(sorted[i]==0)
                result.add(i+1);
        }   
        return result;      
    }
}