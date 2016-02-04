import java.io.*;
import java.util.*;
public class addOne{
	public static int[] plusOne(int[] digits) {
	       int num =0;
	       for(int i=0;i<digits.length;i++){
	       	System.out.println("num l--"+digits[i]);
	       	System.out.println(digits[i]*Math.pow(10,digits.length-i-1));
	           num = num + digits[i]*(int)Math.pow(10,digits.length-i-1);
	           System.out.println(num+"-------at "+i);
	           
	       }
	       System.out.println("num original"+num); 
	       num = num+1;
	       System.out.println("num later"+num); 
	       int m = num;
	       //String s = Integer.toString(num);
	       //int len = s.length();
	       int len = 0;
	       while(m>0){
	         len = len+1;
	         m = m/10;
	       }
	       int[] x = new int[len];
	       int index = len-1;
	       
	       while(num>0){
	        x[index] = num %10;
	        num = num/10;
	        System.out.println("Quotient:"+x[index]);
	        System.out.println("Remainder:"+num);
	        index=index-1;
	       }
	       
	       return x;
	    }
	public static void main(String[] args){
		int[] num = {9,8,7,6,5,4,3,2,1,0};
	 
		int[] ret = plusOne(num);
	}
}
