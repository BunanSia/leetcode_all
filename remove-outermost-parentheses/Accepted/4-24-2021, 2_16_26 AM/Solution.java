// https://leetcode.com/problems/remove-outermost-parentheses

class Solution {
    public String removeOuterParentheses(String S) {
        char[] arr=S.toCharArray();
        StringBuilder result= new StringBuilder();
        int open=0;
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]=='('){
                    if(open!=0)
                        result.append("(");
                    open++;
                }
                else if(arr[i]==')'){
                    if(open!=1)
                        result.append(")");
                    open--;
                }
        }
        
        return result.toString();
    }
}