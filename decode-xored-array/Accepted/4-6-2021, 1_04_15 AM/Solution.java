// https://leetcode.com/problems/decode-xored-array

class Solution {
    int decoded[];
    public int[] decode(int[] encoded, int first) {
        decoded=new int[encoded.length+1];
        decoded[0]=first;
        decoded[1]=first^encoded[0];
        for(int i=2;i<encoded.length+1;i++){
            decoded[i]=decoded[i-1]^encoded[i-1];
        }
        return decoded;
    }
}