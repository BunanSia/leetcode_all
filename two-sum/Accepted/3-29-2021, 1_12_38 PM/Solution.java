// https://leetcode.com/problems/two-sum

class Solution {
    int result[]=new int[2];
    public int[] twoSum(int[] nums, int target) {
                for(int x=0;x<nums.length;x++){
                for(int y=x+1;y<nums.length;y++){
                    int z=nums[x]+nums[y];
                    if(z==target){
                        result[0]=x;
                        result[1]=y;
                        
                    }                
                } 
            }
        return result;
          }
        }