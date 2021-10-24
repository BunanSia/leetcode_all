// https://leetcode.com/problems/binary-watch

class Solution {
    ArrayList<String>result=new ArrayList<String>();
    public List<String> readBinaryWatch(int num) {
        for(int hours=0;hours<12;hours++){
            for(int minutes=0;minutes<60;minutes++){
                if(Integer.bitCount(minutes)+Integer.bitCount(hours)==num){
                    if(minutes<10)
                        result.add(hours+":"+"0"+minutes);
                    
                    else
                        result.add(hours+":"+minutes);
                }
            }
        }
        return result;
    }
}