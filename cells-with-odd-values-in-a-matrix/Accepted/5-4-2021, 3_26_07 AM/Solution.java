// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int result=0;
        int[][] array=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                array[i][j]=0;         
        }
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<m;j++)
                array[j][indices[i][1]]++;
            for(int k=0;k<n;k++)
                array[indices[i][0]][k]++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                if(array[i][j]%2==1)
                    result++;
        }
        return result;
    }
}