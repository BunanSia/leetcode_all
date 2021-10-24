// https://leetcode.com/problems/check-if-the-sentence-is-pangram

class Solution {
    boolean result=true;
    public boolean checkIfPangram(String sentence) {
        char[] arr=sentence.toCharArray();
        int[] digit=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            digit[i]=arr[i]-'a';
        }
        Arrays.sort(digit);
        for(int i=1;i<digit.length;i++){
            if(digit[i]!=digit[i-1]&&digit[i]!=digit[i-1]+1){
                result=false;
                break;
            }
        }
        if(digit[digit.length-1]!=25)
                result=false;
        return result;
    }
}