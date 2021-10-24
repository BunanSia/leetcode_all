// https://leetcode.com/problems/maximum-69-number

class Solution {
    public int maximum69Number (int num) {
    int temp;
    int result=num;
    int length = (int) (Math. log10(num) + 1);
    int ten=1;    
        for(int i=1;i<length;i++)
            ten=ten*10;
        temp=num;
        for(int i=0;i<length;i++){
            if(temp/ten==9){
                temp=temp-ten*9;
                ten=ten/10;
            }
            else{
                result=num+3*ten;
            }
        }
        return result;
    }
}