// https://leetcode.com/problems/unique-morse-code-words

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();
        String[] convert=new String[words.length];
        for(int i=0;i<words.length;i++){
            char[] temp=words[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<temp.length;j++){
                sb.append(morse[temp[j]-'a']); 
            }
            s.add(sb.toString());
        }
        return s.size();
    }
}