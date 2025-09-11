class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int i=0,j=n-1;
        if(target<nums[0])
        {
            return 0;
        }
        else if(target>nums[n-1])
        {
            return n;
        }
        
       int mid =0;
        while(i<=j)
        {
            mid = (i+j)/2;
            if(nums[i] ==target || nums[j] == target)
            {
                 return nums[i] == target ? i : j;
            }
            else if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                i=mid+1;
            }
            else if(nums[mid] > target)
            {
               j=mid-1;
            }
        }
        return i;
        
    }
}