// https://leetcode.com/problems/maximum-ice-cream-bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        int result=costs.length;
        for(int i=0;i<costs.length;i++)
            sum+=costs[i];
        int i=costs.length-1;
        while(sum>coins){
            sum-=costs[i--];
            result--;
        }
        return result;
    }
}