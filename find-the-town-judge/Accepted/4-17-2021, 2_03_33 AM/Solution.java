// https://leetcode.com/problems/find-the-town-judge

class Solution {
    int howManyTrust;
    int candidate;
    int peopleWhoTrustHim;
    public int findJudge(int N, int[][] trust) {
        int result=-1;
        int[]arr=new int[N];
        for(int i=0;i<trust.length;i++){
            arr[trust[i][0]-1]--;
            arr[trust[i][1]-1]++;
        }
        for(int i=0;i<N;i++){
            if(arr[i]==N-1)
                result=i+1;
        }
        return result;
    }
}