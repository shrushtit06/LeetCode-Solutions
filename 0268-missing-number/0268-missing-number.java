class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int array_sum = 0;
        int sum = 0;
        sum = n*(n + 1)/2;
        for(int i = 0; i < nums.length; i++){
            array_sum += nums[i];
        }

        int output = sum - array_sum;
        return output;
    }
}