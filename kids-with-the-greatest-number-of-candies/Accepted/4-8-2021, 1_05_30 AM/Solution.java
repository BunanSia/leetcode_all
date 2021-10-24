// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

class Solution {
    List<Boolean> result=new ArrayList<Boolean>();
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i=0;i<candies.length;i++){
            if(max>candies[i]+extraCandies)
                result.add(false);
            else   
                result.add(true);
        }
        return result;
    }
}