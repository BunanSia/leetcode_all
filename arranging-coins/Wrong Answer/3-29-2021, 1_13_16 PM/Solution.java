// https://leetcode.com/problems/arranging-coins

class Solution {
    int n=0;
    public int arrangeCoins(int n) {
        for(int i=1;i<=n;i++){
            if(n<=i){
                break;
            }
            n-=i;
            n++;
        }
        return n;
    }
}