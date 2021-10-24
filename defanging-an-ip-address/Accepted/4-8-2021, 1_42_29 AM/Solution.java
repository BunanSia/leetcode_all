// https://leetcode.com/problems/defanging-an-ip-address

class Solution {
    char result[];
    int j=0;
    public String defangIPaddr(String address) {
        char[]ch=address.toCharArray();
        result=new char[ch.length+10];
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='.'){
                result[j]='[';
                result[j+1]='.';
                result[j+2]=']';
                j+=3;
            }
            else
                result[j]=ch[i];
                j++;
        }    
        String resultString=Arrays.toString(result).replace(",", "").replace("\u0000","").replace(" ","").trim(); 
        resultString=resultString.substring(1,resultString.length()-1);
        return resultString;
    }
}