// https://leetcode.com/problems/determine-if-string-halves-are-alike

class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr=s.toCharArray();
        int first=0;
        int second=0;
        for(int i=0;i<arr.length/2;i++){
                    if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
                first++;
        }
        for(int i=arr.length/2;i<arr.length;i++){
                    if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
                second++;
        }
        if(first==second)
            return true;
        else
            return false;
    }
}