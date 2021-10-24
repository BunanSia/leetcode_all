// https://leetcode.com/problems/unique-morse-code-words

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();
        String[] convert=new String[words.length];
        for(int i=0;i<words.length;i++){
            char[] temp=words[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            convert[i]="";
            for(int j=0;j<temp.length;j++){
                convert[i]+=morse[temp[j]-'a'];
                sb.append(morse[temp[j]-'a']); 
            }
            s.add(sb.toString());
        }
        int result=0;
        return s.size();
    }
}