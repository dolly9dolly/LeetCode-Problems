class Solution {
    public int maxArea(int[] height) {
        int Left = 0;
        int Right = height.length - 1;
        int maxA = 0;
        while(Left < Right){
                int width = Right-Left;
                int waterheight = Math.min(height[Left], height[Right]);
                int currentArea = width * waterheight;
                maxA = Math.max(maxA, currentArea);
                if(waterheight == height[Left]) {
                    Left++;
                } else {
                    Right--;
                }
                
        }
        return maxA;
    }
}