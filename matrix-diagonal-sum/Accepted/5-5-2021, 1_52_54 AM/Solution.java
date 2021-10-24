// https://leetcode.com/problems/matrix-diagonal-sum

class Solution {
    public int diagonalSum(int[][] mat) {
        int result=0;
        for(int i=0;i<mat.length;i++){
            result+=mat[i][i];
            mat[i][i]=0;
        }
        for(int i=0;i<mat.length;i++){
            result+=mat[mat[i].length-1-i][i];
        }
        return result;
    }
}