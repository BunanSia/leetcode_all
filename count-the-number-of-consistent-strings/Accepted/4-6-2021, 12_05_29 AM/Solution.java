// https://leetcode.com/problems/count-the-number-of-consistent-strings

class Solution {
    int result=0;
    int m=0;
    public int countConsistentStrings(String allowed, String[] words) {
        char[] ch=allowed.toCharArray();
        for(int i=0;i<words.length;i++){
            char[] temp=words[i].toCharArray();
            for(int j=0;j<temp.length;j++){
                m=0;
                while(m<ch.length&&(temp[j]!=ch[m])){
                    m++;
                }
                if(m==ch.length)
                    break;
                if(j==temp.length-1)
                result++;
                
            }

        }
        return result;
    }
}