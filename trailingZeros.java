import java.io.*;
import java.util.*;
class Solution {
    public int trailingZeroes(int n) {
       int sum = 0;
       int count = 1;
       while((n/Math.pow(5,count))>=1){
           sum = sum + n/(int)Math.pow(5,count);
           count = count+1;
       }
       return sum;
    }
}

public class trailingZeros{
	public static void main(String args[]){
		Solution s = new Solution();
		System.out.println(s.trailingZeroes(92));
	}
}