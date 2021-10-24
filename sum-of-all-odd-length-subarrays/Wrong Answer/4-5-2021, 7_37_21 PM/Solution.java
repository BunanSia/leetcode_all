// https://leetcode.com/problems/sum-of-all-odd-length-subarrays

class Solution {
    int max=0;
    int sum=0;
    public int sumOddLengthSubarrays(int[] arr) {
        if(arr.length%2==0){
            for(int i=0;i<arr.length;i++){
                if(i<=(arr.length-1)/2)
                    sum+=arr[i]*((arr.length)/2+i);
                else
                    sum+=arr[i]*(arr.length-(i-arr.length/2+1));
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(i<=(arr.length-1)/2)
                    sum+=arr[i]*((arr.length)/2+i+1);
                else
                    sum+=arr[i]*(arr.length-(i-arr.length/2));
            } 
        } 
        return sum;
    }
}