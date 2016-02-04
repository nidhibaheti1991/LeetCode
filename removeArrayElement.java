
/*
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.




*/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int lastIndex = nums.length-1;
        for(int i=0;i<lastIndex+1;i++){
            if(nums[i]==val){
                nums[i] = nums[lastIndex];
                lastIndex--;
                i--;
            }
        }
        return lastIndex+1;
    }
}