class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        return new int[] {};
    }
}

//for sorted array using 2 pointers.
        // int left=0;
        // int right = n-1;
        // while(left<right)
        // { 
        //     if((nums[left]+nums[right])<target)
        //     {
        //        left++;
        //     }
        //     else if((nums[left]+nums[right])>target)
        //     {
        //        right--;
        //     }
        //      else if((nums[left]+nums[right])==target)
        //     {
        //        return new int[]{left,right};
        //     }
        // }
        // return new int[0];