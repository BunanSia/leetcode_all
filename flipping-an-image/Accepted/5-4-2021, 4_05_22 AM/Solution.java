// https://leetcode.com/problems/flipping-an-image

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int temp;
        int c;
        for(int i=0;i<image.length;i++){
            c=image[i].length;
            for(int a=0;a<c/2;a++){
                temp=image[i][a];
                image[i][a]=image[i][c-a-1];
                image[i][c-a-1]=temp;
            }
            for(int k=0;k<c;k++){
                if(image[i][k]==0)
                    image[i][k]=1;
                else
                    image[i][k]=0;
            }
        }
        return image;
    }
}