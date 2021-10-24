// https://leetcode.com/problems/create-target-array-in-the-given-order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int max=0;
        int[] result=new int[index.length];
        int[] temp=new int[index.length];
        for(int i=0;i<index.length;i++){
            temp[i]=index[i];
        }
        for(int i=0;i<index.length;i++){            
            for(int j=0;j<i;j++){
                if(temp[j]<index[i])
                    continue;
                else
                    temp[j]++;
            }
        }
        temp[index.length-1]=index[index.length-1];
        for(int i=0;i<index.length;i++){
            result[temp[i]]=nums[i];
        }
        return result;
    }
}