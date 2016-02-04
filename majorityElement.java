import java.util.*;
public class MajorityElement{
	public static void main(String[] args){
		
	}
	
}

/*
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        int sizeOfArray = nums.length;
        int majNum = 0;
        int majorityNumber = sizeOfArray/2;
        for(int i =0;i<sizeOfArray;i++){
            if(!(countMap.containsKey(nums[i]))){
                countMap.put(nums[i],1);
                majNum = nums[i];
            }
            else{
                int currentCount = countMap.get(nums[i]);
                int newCount = currentCount+1;
                countMap.replace(nums[i],currentCount,newCount);
                if(newCount>majorityNumber){
                    majNum = nums[i];
                    break;
                }
                
            }
            
        }
        return majNum;
    }
}
*/

/*
 Arrays.sort(nums);
 return nums[nums.length/2];


*/