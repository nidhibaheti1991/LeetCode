public class Solution {
    public boolean isHappy(int n) {
    boolean val = false;
    int digit = 0;
    int sum = 0;
    int init = n;
    ArrayList<Integer> checked = new ArrayList<Integer>();
    checked.add(init);
     while(n>0){
         digit = n%10;
         n = n/10;
         sum = sum+(digit*digit);
         if(n==0 && sum==1){
             val = true;
             break;
         }
         else if(n==0 && sum!=1){
             if(checked.contains(sum)){
                 break;
             }
             n=sum;
             checked.add(n);
             sum=0;
             continue;
         }
     }
     return val;
    }
}