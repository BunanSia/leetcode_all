// https://leetcode.com/problems/minimum-time-visiting-all-points

class Solution {
    int result=0;
    int x=0;
    int y=0;
    public int minTimeToVisitAllPoints(int[][] points) {
        for(int i=0;i<points.length-1;i++){
            if(Math.abs(points[i+1][0]-points[i][0])==Math.abs(points[i+1][1]-points[i][1])){
                result+=Math.abs(points[i+1][1]-points[i][1]);
            }
            else{
                if(Math.abs(points[i+1][0]-points[i][0])>Math.abs(points[i+1][1]-points[i][1])){
                    result+=Math.abs(points[i+1][0]-points[i][0])-Math.abs(points[i+1][1]-points[i][1]);
                    result+=Math.abs(points[i+1][1]-points[i][1]);} 
                else{
                    result+=Math.abs(points[i+1][1]-points[i][1])-Math.abs(points[i+1][0]-points[i][0]);
                    result+=Math.abs(points[i+1][0]-points[i][0]); }
                }
                }
            return result;
            }

        }
