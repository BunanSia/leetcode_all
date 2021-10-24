// https://leetcode.com/problems/destination-city

class Solution {
    public String destCity(List<List<String>> paths) {
        List<String>start=new ArrayList<String>();
        List<String>end=new ArrayList<String>();
        for(int i=0;i<paths.size();i++)
            start.add(paths.get(i).get(0));
        for(int i=0;i<paths.size();i++){
            if(!start.contains(paths.get(i).get(1))){
                end.add(paths.get(i).get(1));
                break;
            }
        }
        String result=end.toString().replace("[", "")  //remove the right bracket
    .replace("]", "");
        return result;
    }
}