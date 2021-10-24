// https://leetcode.com/problems/number-of-substrings-with-only-1s

class Solution {
    List<Integer> sorted=new ArrayList<Integer>();
    long result=0;
    int bitnum=0;
    int mod=1_000_000_007;
    public int numSub(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                this.bitnum++;                
            if(s.charAt(i)=='0'){
                sorted.add(this.bitnum);
                this.bitnum=0;
            }
        }
        sorted.add(this.bitnum);
        for(int i=0;i<sorted.size();i++){
            if(sorted.get(i)!=0){
                for(int j=1;j<=sorted.get(i);j++){
                    this.result+=j;
                }
            }     
        }
        return (int)(result%mod);
    }
}