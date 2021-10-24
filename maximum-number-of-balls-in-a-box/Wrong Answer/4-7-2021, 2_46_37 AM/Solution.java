// https://leetcode.com/problems/maximum-number-of-balls-in-a-box

class Solution {
    int arr[];
    int result=0;
    public int countBalls(int lowLimit, int highLimit) {
        arr=new int[36];
        for(int i=lowLimit;i<highLimit+1;i++){
            int temp=i;
            int sum=0;
            while(temp>9){
                sum+=temp%10;
                temp=temp/10;
            }
            sum+=temp;
            arr[temp]++;
        }
        for(int i=0;i<36;i++){
            if(arr[i]>result)
                result=arr[i];
        }
        return result;
    }
}