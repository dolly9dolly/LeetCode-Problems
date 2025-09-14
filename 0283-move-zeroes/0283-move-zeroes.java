
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0,j=i+1;
        int temp;
        while(j<n)
        {
            if(nums[i]!=0 && nums[j]==0)
            {
                i=j;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0)
            {
                j++;
            }
            else if(nums[i]!=0 && nums[j]!=0)
            {
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]!=0)
            {
                temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }

        }
       
    }
}