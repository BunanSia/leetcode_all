// https://leetcode.com/problems/shuffle-the-array

class Solution {
    int result[];
    public int[] shuffle(int[] nums, int n) {  
        int[] result=new int[n*2];
        int[] temp1=new int[n];
        int[] temp2=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
            temp1[j++]=nums[i];   
        j=0;
        for(int i=n;i<2*n;i++)
            temp2[j++]=nums[i];
        j=0;
        int index1=0;
        int index2=0;
        while(j<2*n){
            result[j++]=temp1[index1++];
            result[j++]=temp2[index2++];
        }
        return result;
    }
}