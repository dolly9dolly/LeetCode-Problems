class Solution {
    public boolean isPalindrome(String s) {
      
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                s1.append(c);
            }
        }
        s = s1.toString();
        int l=0;
        int r= s.length()-1;
        while(l<r)
        {

            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r)))
            {
                l++;
                r--;
            }
            else 
            return false;
        }
        return true;
    }
}