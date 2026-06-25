class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        for(int left=0;left<nums.length;left++) {
            int zerocount = 0;
            for(int right = left;right<nums.length;right++) {
                if(nums[right]==0) {
                 zerocount++;
                }
                if(zerocount > k) {
                    break;
                }
             int arrlength = right - left + 1;
             count = Math.max(count, arrlength);
        }
        }
        return count;
    }
    
}