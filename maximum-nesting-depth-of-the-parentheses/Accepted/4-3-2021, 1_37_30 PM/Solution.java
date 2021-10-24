// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses

class Solution {
    int current_max=0;
    int max=0;
    public int maxDepth(String s) {
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('){
                current_max++;
                if(current_max>max)
                    max=current_max;
            }
            else if(chars[i]==')'){
                if(current_max>0)
                current_max--;
                else
                return -1;
            }
        }
        return max;
    }
}