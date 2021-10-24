// https://leetcode.com/problems/queue-reconstruction-by-height

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int[][] result;
        result=new int[people.length][2];
        Arrays.sort(people, new Comparator<int[]>(){
            @Override
            public int compare(int[] first, int[] second) {
               if(first[0] > second[0]) return 1;
               else return -1;
            }
       });
       for(int i=0;i<people.length;i++){
           result[i][0]=0;
       }
       for(int i=0;i<people.length;i++){
           int shift=people[i][1];
           int temp=i+shift;
           if(result[temp][0]==0){
               result[temp][0]=people[i][0];
               result[temp][1]=people[i][1];   
           }
           else if(result[temp][0]!=0){
               for(int j=0;j<people.length;j++){
                   if(shift==0&&result[j][0]==0){
                       result[j][0]=people[i][0];
                       result[j][1]=people[i][1];
                   }
                   else if(shift==0&&result[j][0]<people[i][0]){
                       continue;
                   }
                   else if(shift!=0&&(result[j][0]==0||result[j][0]>people[i][0])){
                       shift--;
                       continue;
                   }
               }
           }
       }
       return result;
    }
}