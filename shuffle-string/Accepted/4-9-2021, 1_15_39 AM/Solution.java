// https://leetcode.com/problems/shuffle-string

class Solution {
    String result;
    char sorted[];
    public String restoreString(String s, int[] indices) {
        sorted=new char[indices.length];
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            sorted[indices[i]]=ch[i];
        }
        result = String.valueOf(sorted);
        return result;
    }
}