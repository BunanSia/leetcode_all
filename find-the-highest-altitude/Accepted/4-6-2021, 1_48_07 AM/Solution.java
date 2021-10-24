// https://leetcode.com/problems/find-the-highest-altitude

class Solution {
    int[] altitude;
    int result;
    public int largestAltitude(int[] gain) {
        altitude=new int[gain.length+1];
        altitude[0]=0;
        for(int i=1;i<gain.length+1;i++)
            altitude[i]=altitude[i-1]+gain[i-1];
        Arrays.sort(altitude);
        result=altitude[altitude.length-1];
        return result;
    }
}