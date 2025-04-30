class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int c=1;
           for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length || chars[i] != chars[i + 1]) {
                s.append(chars[i]);
                if (c > 1) {
                    s.append(c);
                }
                c = 1; 
            } else {
                c++; 
            }
        }
       for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
       
        return s.length();

    }
}