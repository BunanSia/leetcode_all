// https://leetcode.com/problems/count-items-matching-a-rule

class Solution {
    int result=0;
    int type=0;
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        switch(ruleKey) {
          case "type":
            type=0;
            break;
          case "color":
            type=1;
            break;
          case "name":
            type=2;
            break;
        }
        for(List list:items){
            if(list.get(type).equals(ruleValue))
                result++;
        }
        return result;   
    }
}