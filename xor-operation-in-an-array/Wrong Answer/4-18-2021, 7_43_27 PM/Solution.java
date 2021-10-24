// https://leetcode.com/problems/xor-operation-in-an-array

class Solution {
    public int xorOperation(int n, int start) {
        if(n%2==0)
            return 0;
        else{
            int result=start+2*n-2;
            return result;
        }
    }
}