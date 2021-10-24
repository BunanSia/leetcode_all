// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping

class Solution {
    public String freqAlphabets(String s) {
        int chiamsi;
        char[]temp=new char[2];
        char[] arr=s.toCharArray();
        char[]result=new char[arr.length];

        int j=0;
        for(int i=arr.length-1;i>-1;i--){
            if(arr[i]=='#'){
                temp[0]=arr[i-1];
                temp[1]=arr[i-2];
                chiamsi=(temp[0]-'0')+10*(temp[1]-'0');   
                result[j++]=(char)('a' + chiamsi-1);
                i-=2;
            }
            else{
                chiamsi=arr[i]-'0';
                result[j++]=(char)(chiamsi+'a'-1);
            }
        }
        char[] sort=new char[j];
        int k=0;
        for(int i=j-1;i>-1;i--){
            sort[k++]=result[i];
        }
        String str = String.valueOf(sort);
        return str;
    }
}
        