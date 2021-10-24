// https://leetcode.com/problems/increasing-decreasing-string

class Solution {
    public String sortString(String s) {
        int count=0;
        int[] alphabet=new int[26];
        char[] arr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            alphabet[arr[i]-'a']++;
        }
        while(count!=26){
            count=0;
            for(int i=0;i<alphabet.length;i++){
                if(alphabet[i]!=0){
                    String c=Character.toString('a'+i);
                    sb.append(c);
                    alphabet[i]--;
                }
                else
                    count++;
        }
            count=0;
            for(int i=alphabet.length-1;i>-1;i--){
                if(alphabet[i]!=0){
                    String c=Character.toString('a'+i);
                    sb.append(c);
                    alphabet[i]--;
                }
                else
                    count++;
            }
        }
        String result=sb.toString();
        return result;
    }
}