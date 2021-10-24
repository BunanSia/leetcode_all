// https://leetcode.com/problems/climbing-stairs

class Solution {
    public int climbStairs(int n) {
        int step2=n/2+1;
        int result=0;
        int power;
        for(int i=0;i<step2;i++){
            power=1;
            if(i==0)
                result+=1;
            else if(i!=0){                
                for(int j=n-i+1;j<n+1;j++){
                power*=j;}
                result+=(power/2);}

            }
            return result;  
        }
}