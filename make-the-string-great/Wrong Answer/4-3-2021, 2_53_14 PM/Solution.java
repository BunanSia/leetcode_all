// https://leetcode.com/problems/make-the-string-great

class Solution {
    int remove=0;
    ArrayList<Character> cur_result=new ArrayList<Character>();
    public String makeGood(String s) {
        for (char c : s.toCharArray()) {
          cur_result.add(c);
        }
        do{
            remove=0;
            for(int i=0;i<cur_result.size();i++){
                if(i>=1&&cur_result.get(i)==cur_result.get(i-1)-32){
                    cur_result.remove(i);
                    cur_result.remove(i-1);
                    remove++;
                }
            }
        }while(remove!=0);
        String final_result=cur_result.toString().replaceAll("[,\\s\\[\\]]", "");
        return final_result;
    }
}