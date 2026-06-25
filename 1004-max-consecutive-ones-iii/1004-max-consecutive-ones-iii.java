class Solution {
    public int longestOnes(int[] nums, int k) {

        int maxLength = 0;

        for (int left = 0; left < nums.length; left++) {

            int zeroCount = 0;

            for (int right = left; right < nums.length; right++) {

                if (nums[right] == 0) {
                    zeroCount++;
                }

                if (zeroCount > k) {
                    break;
                }

                int length = right - left + 1;
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}