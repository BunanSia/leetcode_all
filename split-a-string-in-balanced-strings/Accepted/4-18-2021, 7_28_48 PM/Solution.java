// https://leetcode.com/problems/split-a-string-in-balanced-strings

class Solution {
    int result=0;
    int temp=0;
    public int balancedStringSplit(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='R')
                temp++;
            else if(arr[i]=='L')
                temp--;
            if(temp==0)
                result++;
        }
        return result;
    }

}