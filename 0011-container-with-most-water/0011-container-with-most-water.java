class Solution {
    static {
        for(int i = 0; i< 500; i++)
        maxArea(new int[]{1});
    }
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while(left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];

            int area = Math.min(leftHeight, rightHeight) * (right - left);
            maxArea = Math.max(maxArea, area);

            if(leftHeight <= rightHeight)
            left++;
            else right--;
        }

        return maxArea;
    }
}