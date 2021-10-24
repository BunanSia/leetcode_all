// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number

class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] index=new int[nums.length];
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            index[i]=nums[i];
        Arrays.sort(index);
        for(int i=0;i<nums.length;i++)
            list.add(index[i]);
        for(int i=0;i<nums.length;i++){
            result[i]=list.indexOf(nums[i]);
            }
        return result;
    }
}