/* class Solution {
    public void sortColors(int[] nums) {
       for(int i = 0; i< nums.length-1; i++){
        for(int j = 0; j< nums.length-1-i;j++){
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j + 1] = temp;
            }
        }
       } 
    }
}
*/

class Solution {
    public static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                two++;
            }
        }
        int index = 0;
        while (zero > 0) {
            nums[index] = 0;
            index++;
            zero--;
        }
        while (one > 0) {
            nums[index] = 1;
            index++;
            one--;
        }
        while (two > 0) {
            nums[index] = 2;
            index++;
            two--;
        }
    }
}
