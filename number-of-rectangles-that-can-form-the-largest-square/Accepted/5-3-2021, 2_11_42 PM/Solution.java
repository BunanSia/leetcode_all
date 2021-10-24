// https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max=0;
        int result=0;
        int[] maxLen=new int[rectangles.length];
        for(int i=0;i<rectangles.length;i++){
            if(rectangles[i][0]<rectangles[i][1])
                maxLen[i]=rectangles[i][0];
            else
                maxLen[i]=rectangles[i][1];
            if(maxLen[i]>max)
                max=maxLen[i];
        }
        for(int i=0;i<rectangles.length;i++){
            if(maxLen[i]==max)
                result++;
        }
        return result;        
    }
}