class Solution {
    public String reverseVowels(String s)
     {
    
        StringBuilder vowels = new StringBuilder();
        
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            ch = Character.toLowerCase(ch);
            if(isVowel(ch))
            {
                vowels.append(s.charAt(i));
            }
        }
        vowels.reverse();
        int vowelIndex=0;
         StringBuilder result = new StringBuilder(s);
        for(int i =0;i<s.length();i++)
        {
            char ch = Character.toLowerCase(s.charAt(i));
            if(isVowel(ch))
            {
                result.setCharAt(i,vowels.charAt(vowelIndex));
                vowelIndex++;
            }
        }
        return result.toString();
    }
         public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
}