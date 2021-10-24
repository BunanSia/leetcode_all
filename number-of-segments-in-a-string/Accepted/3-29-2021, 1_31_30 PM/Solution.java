// https://leetcode.com/problems/number-of-segments-in-a-string

class Solution {

    int result=0;
    public int countSegments(String s) {
        char[] charsorted=s.toCharArray();

        for(int i=0;i<charsorted.length;i++){
            if(i==0&&charsorted[i]==' ')
                continue;
            else if(charsorted[i]==' '&&charsorted[i-1]==' ')
                continue;
            else if(i==charsorted.length-1||charsorted[i]==' '){
                result++; 
            }

        }
        return result;
    }
}