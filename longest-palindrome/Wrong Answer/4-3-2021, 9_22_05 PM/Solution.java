// https://leetcode.com/problems/longest-palindrome

import java.util.stream.Collectors;
class Solution {
    int remove=0;
    int result=0;
    ArrayList<Character> cur_result=new ArrayList<Character>();
    public int longestPalindrome(String s) {
        for (char c : s.toCharArray()) {
          cur_result.add(c);
        }
        do{
            remove=0;
            for(int i=0;i<cur_result.size();i++){
                if(i>=1&&cur_result.get(i)==cur_result.get(i-1)){
                    cur_result.remove(i);
                    cur_result.remove(i-1);
                    result+=2;
                    remove++;
                }
            }
        }while(remove!=0);
        if(!cur_result.isEmpty())
            result++;
        return result;
    }
}