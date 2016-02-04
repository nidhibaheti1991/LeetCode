// Move zeros in a list to the end [0 1 0 3 12] ->[1 3 12 0 0]
public class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            i++;
        }
    }
}