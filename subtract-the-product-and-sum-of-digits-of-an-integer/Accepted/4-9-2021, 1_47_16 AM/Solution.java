// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer

class Solution {
    int digit[];
    public int subtractProductAndSum(int n) {
        int temp=n;
        digit=new int[6];
        int i=0;
        while(temp>9){
            digit[i++]=temp%10;
            temp/=10;
        }
        digit[i]=temp;
        int product=digit[0];
        int sum=digit[0];
        for(int j=1;j<i+1;j++){
            product*=digit[j];
            sum+=digit[j];
        }
        int result=product-sum;
        return result;
    }
}