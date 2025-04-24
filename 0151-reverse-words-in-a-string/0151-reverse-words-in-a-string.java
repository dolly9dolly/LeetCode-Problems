class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int i =0;
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<String>();
        while(i < s.length())
        {
           while(i<s.length() && s.charAt(i) == ' ')
           { 
                i++;
           }
           sb.setLength(0);
            while(i<s.length() && s.charAt(i) != ' ')
            {
             sb.append(s.charAt(i));
             i++;
            }
           if(sb.length()>0)
           {
             res.add(sb.toString());
           }
           }
           Collections.reverse(res);
           return String.join(" ",res);
    }
}