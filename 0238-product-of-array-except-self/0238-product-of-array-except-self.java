class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
       int n = nums.length;
       int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];
        //result[i]=prefix[i]*suffix[i]; -> logic
        for(int i=0;i<n;i++)
        {
           if(i == 0)
           {
            prefix[i]=1;
           }
           else 
           {
            prefix[i]=nums[i-1]*prefix[i-1];
           } 
        }
         for(int i=n-1;i>=0;i--)
        {
           if(i == n-1)
           {
            suffix[i]=1;
           }
           else 
           {
            suffix[i]=nums[i+1]*suffix[i+1];
           } 
        }
        for(int i=0;i<n;i++)
        {
            result[i] = prefix[i]*suffix[i];
        }
        return result;
    }
}
     
        //solution with division .
    //    int n = nums.length;
    //    int[] li = new int[n];
    //    for(int k=0;k<n;k++)
    //    {
    //      int product =1;
    //       for(int i =0;i<n;i++)
    //    {
    //       product = product*nums[i];
           
    //    } 
    //    if(nums[k]!=0)
    //    {
    //      product = product/nums[k];
    //    li[k]=product;
    //    }
    //    else {
    //             li[k] = 0;
    //         }
    //    }
    //    return li;
