// https://leetcode.com/problems/power-of-four

class Solution {
    double temp;
    boolean result;
    public boolean isPowerOfFour(int n) {
        temp=Math.log(n)/Math.log(4);
        if((temp-(int)temp)!=0)
            result=false;
        else
            result=true;
        return result;
    }
}