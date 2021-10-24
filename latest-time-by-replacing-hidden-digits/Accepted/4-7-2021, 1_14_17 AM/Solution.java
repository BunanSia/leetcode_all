// https://leetcode.com/problems/latest-time-by-replacing-hidden-digits

class Solution {
    public String maximumTime(String time) {
        char[]ch=time.toCharArray();
        while(ch[0]=='?'||ch[1]=='?'){
            int temp=ch[1]-'0';
            if(ch[0]=='?'){
                if(ch[1]=='?'){
                    ch[0]='2';
                    ch[1]='3';
                }
                else if(temp<4)
                    ch[0]='2';
                else if(temp>3)
                    ch[0]='1';
            }
            else if(ch[0]=='0'||ch[0]=='1')
                ch[1]='9';
            else if(ch[0]=='2')
                ch[1]='3';
        }
        if(ch[3]=='?')
            ch[3]='5';
        if(ch[4]=='?')
            ch[4]='9';
        String result = String.valueOf(ch);
        return result;
    }
}