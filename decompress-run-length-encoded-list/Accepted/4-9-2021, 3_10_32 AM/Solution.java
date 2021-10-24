// https://leetcode.com/problems/decompress-run-length-encoded-list

class Solution {
    List<Integer>arr=new ArrayList<Integer>();
    public int[] decompressRLElist(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i];j++)
                arr.add(nums[i+1]);
            i++;
        }
        int[] result = arr.stream().mapToInt(i -> i).toArray();
        return result;
    }
}