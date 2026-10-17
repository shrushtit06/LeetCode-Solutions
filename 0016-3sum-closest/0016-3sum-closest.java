class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = Integer.MAX_VALUE;
        int output = 0;
        for(int i=0; i < nums.length; i++){
            for(int j= i+1; j < nums.length; j++){
                for(int k = j + 1;k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int check =  Math.abs(sum - target);
                    if(check <= n){
                        n = check;
                        output = sum; 
                    }
                }
            }
        }
        return output;
    }
}