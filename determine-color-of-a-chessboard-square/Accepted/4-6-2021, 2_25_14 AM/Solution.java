// https://leetcode.com/problems/determine-color-of-a-chessboard-square

class Solution {
    boolean result;
    int[] input=new int[2];
    public boolean squareIsWhite(String coordinates) {
        char[] ch=coordinates.toCharArray();
        input[0]=ch[0]-'a';
        input[1]=ch[1]-'1';
        if(((input[0]%2)^(input[1]%2))==1)
            result=true;
        else
            result=false;
        return result;
    }
}