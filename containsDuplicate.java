public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0 || nums.length==1) return false;
        HashMap<Integer,Integer> map =  new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],1);
            }
        }
        return false;
    }
}