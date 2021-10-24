// https://leetcode.com/problems/relative-ranks

class Solution {
    int x;
    int index;
    int temp;
    List<Integer>list=new ArrayList<Integer>();
    String[] result;
    public String[] findRelativeRanks(int[] score) {
        result=new String[score.length];
        for(int i=0;i<score.length;i++)
            list.add(score[i]);
        Collections.sort(list);
        for(int i=0;i<score.length;i++){
            temp=list.indexOf(score[i]);
            if(temp==score.length-1)
                result[i]="Gold Medal";
            else if(temp==score.length-2)
                result[i]="Silver Medal";
            else if(temp==score.length-3)
                result[i]="Bronze Medal";
            else
                result[i]=""+(score.length-temp);
        }
        return result;
    }
}