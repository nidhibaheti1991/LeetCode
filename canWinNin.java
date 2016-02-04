public class Solution {
    public boolean canWinNim(int n) {
        /*boolean win = false;
        if(n>0){
            if((n-1)==0||(n-2)==0||(n-3)==0){
               win = true;
            }
            else if((n>6) && (canWinNim(n-6)||canWinNim(n-5)||canWinNim(n-4)||canWinNim(n-3)||canWinNim(n-2))){
                   win = true;
            }
            else{
                win = false;
            }
        }
        
       return win;*/
    return (n % 4) != 0;
    }
}