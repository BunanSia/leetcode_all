// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero

class Solution {
    public int numberOfSteps(int num) {
        int result=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
                result++;

            }
            else{
                num-=1;
                result++; 
            }               
        }
        return result;
    }
}