public class Solution {
    public int reverse(int x) {
        long original = (long)x;
        long newNum = 0;
        if(original<0){
          original=-1*original;  
        }
        int count=Integer.toString((int)original).length();
        while(original>0){
            long temp = 0;
            long rem = original%10;
            original = original/10;
            count=count-1;
            temp = rem*((long)Math.pow(10,count));
            newNum = newNum+temp;
          
        }
        if(newNum>Integer.MAX_VALUE){
                newNum=0;
        }
        if(x<0){
            newNum = -1*newNum;
        }
        return (int)newNum;
    }
}