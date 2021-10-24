// https://leetcode.com/problems/truncate-sentence

class Solution {
    public String truncateSentence(String s, int k) {
        int current=k;
        char[] ch=s.toCharArray();
        StringBuilder str= new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(current==0||(current==1&&ch[i]==' '))
                break;
            else if(ch[i]!=' '){
                String temp=Character.toString(ch[i]);
                str.append(temp);
            }
            else if(ch[i]==' '){
                str.append(" ");
                current--;
            }
        }
        String result=new String();
        result=str.toString();
        return result;        
    }
}