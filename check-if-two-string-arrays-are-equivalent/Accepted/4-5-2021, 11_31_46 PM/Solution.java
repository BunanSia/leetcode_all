// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent

class Solution {
    boolean result;
    String sored1;
    String sorted2;
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuffer sb1 = new StringBuffer();
      for(int i = 0; i < word1.length; i++) {
         sb1.append(word1[i]);
      }
      String sorted1 = sb1.toString();
      StringBuffer sb2 = new StringBuffer();
      for(int i = 0; i < word2.length; i++) {
         sb2.append(word2[i]);
      }
      String sorted2 = sb2.toString();
      if(sorted1.equals(sorted2))
          result=true;
      else
          result=false;
    return result;
    }
}