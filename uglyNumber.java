public class Solution {
    public boolean isUgly(int num) {
       boolean ugly = false;
       boolean x =true;
        if(num==1){
            ugly = true;
            x = false;
        }
        if(num<0){
            ugly = false;
            x =false;
        }

        while(num>0 && x){
            if(num%2==0){
                num = num/2;
            }
            else if(num%3==0){
                num = num/3;
            }
            else if(num%5==0){
                num = num/5;
            }
            else{
                if(num!=1){
                    ugly=false;
                }
                else {
                    ugly = true;
                }
                break;
            }
            
        }
        
        return ugly; 
     
        
    }
}