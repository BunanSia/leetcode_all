// https://leetcode.com/problems/arranging-coins

class Solution {
    int n=0;
    public int arrangeCoins(int n) {
        if(n==1){
            this.n=1;
            return this.n;
        }
        for(int i=1;i<=n;i++){
            if(n<=i){
                break;
            }
            n-=i;
            this.n++;
        }
        return this.n;
    }
}