// https://leetcode.com/problems/self-dividing-numbers

class Solution {
    List<Integer> result=new ArrayList<Integer>();
    public List<Integer> selfDividingNumbers(int left, int right) {
        for(int i=left;i<right+1;i++){
            boolean self_dividing=true;
            int temp=i;
            while(temp>0){
                int num=temp%10;
                if(num==0||i%num!=0)
                    self_dividing=false;
                temp=temp/10;
            }
            if(self_dividing)
                result.add(i);
        }
        return result;
    }
}