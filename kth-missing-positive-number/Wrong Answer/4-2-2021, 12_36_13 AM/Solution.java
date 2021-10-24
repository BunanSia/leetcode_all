// https://leetcode.com/problems/kth-missing-positive-number

class Solution {
    int i=0;
    int m=0;
    int j=0;
    public int findKthPositive(int[] arr, int k) {
            while(true){
                if(i==k)
                    break;
                if(j!=arr[m]){
                    i++;
                    j++;                    
                }
                if(j==arr[m]){
                    if(m<arr.length-1){
                        m++;
                        j++;
                    }
                    else if(m==arr.length-1){
                        j++;
                    }
                }
            }
            return j;
        }
}