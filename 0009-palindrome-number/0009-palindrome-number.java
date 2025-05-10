class Solution {
    public boolean isPalindrome(int x) 
    {
      String s = Integer.toString(x);
      int j= s.length()-1;
      int i =0;
      while(i<j)
      {
        if(s.charAt(i) != s.charAt(j))
       return false;
       else 
       i++;
       j--;
      }
     return true;
      
    }
}