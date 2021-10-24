// https://leetcode.com/problems/find-center-of-star-graph

class Solution {
    public int findCenter(int[][] edges) {
        int result=-1;
        int temp1=-1;
        int temp2=-1;
        temp1=edges[0][0];
        temp2=edges[0][1];
        for(int i=0;i<2;i++){
            if(edges[1][i]==temp1){
                result=temp1;
                break;
            }
            else if(edges[1][i]==temp2){
                result=temp2;
                break;
            }
        }
        return result;
    }
}