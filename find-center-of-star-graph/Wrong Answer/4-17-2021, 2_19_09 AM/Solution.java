// https://leetcode.com/problems/find-center-of-star-graph

class Solution {
    public int findCenter(int[][] edges) {
        int result=-1;
        int temp1=-1;
        int temp2=-1;
        temp1=edges[0][0];
        temp2=edges[0][1];
        for(int i=0;i<2;i++){
            if(edges[1][i]==temp1)
                result=temp1;
            else
                result=temp2;
        }
        return result;
    }
}