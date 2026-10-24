/* import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {

        int Maxsum = nums[0];
        int currsum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            currsum = Math.max(nums[i], currsum + nums[i]);

            Maxsum = Math.max(Maxsum, currsum);
        }

        return Maxsum;
    }
}
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE, currSum=0;

        for(int i=0; i<nums.length; i++){
            currSum +=nums[i];

            maxSum= maxSum < currSum  ? currSum : maxSum;
            currSum= currSum<0 ? 0 : currSum;
        
        }
        return maxSum;
    }
}