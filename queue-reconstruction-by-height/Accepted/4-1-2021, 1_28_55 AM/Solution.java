// https://leetcode.com/problems/queue-reconstruction-by-height

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int[][] result;
        result=new int[people.length][2];
        java.util.Arrays.sort(people, new java.util.Comparator<int[]>() {
        public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
});
       for(int i=0;i<people.length;i++){
           result[i][0]=-1;
       }
       for(int i=0;i<people.length;i++){
           int shift=people[i][1];
               for(int j=0;j<people.length;j++){
                   if(shift==0&&result[j][0]==-1){
                       result[j][0]=people[i][0];
                       result[j][1]=people[i][1];
                       break;
                   }
                   else if(result[j][0]==-1||result[j][0]>=people[i][0]){
                       shift--;
                   }
               }
       }
       return result;
    }
}