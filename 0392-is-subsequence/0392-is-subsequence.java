class Solution {
    public boolean isSubsequence(String s, String t) {
        int slow = 0;
        char[] arr1 = s.toCharArray();
        char[] arr = t.toCharArray();
        if(arr1.length == 0) { return true;}

        for(char c : arr) {
            if(slow < arr1.length && c == arr1[slow])
                slow++;
        }
        return slow == arr1.length;

    }

}