class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
       List<Boolean> result = new ArrayList<Boolean>();
       int n = candies.length;
       int max = Arrays.stream(candies).max().getAsInt();
       for(int i=0;i<n;i++)
       {
          if(candies[i]+extraCandies >= max)
          {
            result.add(true);
          }
          else{
            result.add(false);
          }
       } 
       return result;
    }
}