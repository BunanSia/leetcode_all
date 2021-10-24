// https://leetcode.com/problems/jewels-and-stones

class Solution {
    int j=0;
    int result=0;
    public int numJewelsInStones(String jewels, String stones) {
        char[] jch=jewels.toCharArray();
        char[] sch=stones.toCharArray();
        for(int i=0;i<sch.length;i++){
            j=0;
            while(j<jch.length&&jch[j]!=sch[i]){
                j++;
            }
            if(j==jch.length)
                continue;
            else
                result++;
        }
        return result;
    }
}