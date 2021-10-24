// https://leetcode.com/problems/richest-customer-wealth

class Solution {
    int result=0;
    int sum=0;
    public int maximumWealth(int[][] accounts) {
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[i].length;j++)
                sum+=accounts[i][j];
            if(sum>result)
                result=sum;                
        }
        return result;
    }
}