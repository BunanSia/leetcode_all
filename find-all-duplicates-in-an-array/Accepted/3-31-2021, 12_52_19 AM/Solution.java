// https://leetcode.com/problems/find-all-duplicates-in-an-array

class Solution {
    List<Integer>result=new ArrayList<Integer>();
    public List<Integer> findDuplicates(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                int temp=nums[i]-1;
                if(nums[temp]>=0){
                nums[temp]=-nums[temp];
                }
                else if(nums[temp]<0){
                result.add(nums[i]);
                }
            }
            else if(nums[i]<0){
                int temp=-nums[i]-1;
                if(nums[temp]>=0){
                nums[temp]=-nums[temp];
                }
                else if(nums[temp]<0){
                result.add(-nums[i]);
                }
             }
        }
        return result;
    }
}