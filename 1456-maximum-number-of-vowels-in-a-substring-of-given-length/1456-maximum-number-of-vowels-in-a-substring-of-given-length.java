class Solution {
    public int maxVowels(String s, int k) {
        String v = "aeiou";
        char[] c = v.toCharArray();
        char[] givs = s.toCharArray();
        int count = 0;
        int maxcount = 0;
        int left = 0;
        for(int right=0;right<givs.length;right++) {
            for(char vowel : c) {
                if(givs[right]==vowel) {
                    count++;
                }
            }
            if(right - left + 1 == k) {
                maxcount = Math.max(maxcount, count);
                for(char vowel : c) {
                    if(givs[left] == vowel) {
                        count--;
                    }
                }
         left++;
        }
        }
        return maxcount;
    }
}