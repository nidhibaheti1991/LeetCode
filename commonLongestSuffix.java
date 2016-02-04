import java.io.*;
import java.util.*;
public class commonLongestSuffix{
	public static void main(String[] args){
		String[] str = {"scooter","meter","hooter"};
		String testChar = "";
		String finalChar = "";
		int i = str[0].length()-1;
		System.out.println(i);
		int k =1;
		while(i>0){
			
		
			//testChar = "r";
			System.out.println(testChar);
			for(String s:str){
				StringBuilder sb = new StringBuilder(s);
				sb.reverse();
				System.out.println(sb.length());
				if(new String(sb.charAt(k)).compareTo(str[0].charAt(i))==0){
					continue;
					
				}
				else{
					break;
				}
			}
			if(i!=0){
				i = i-1;
			}
			k=k+1;
			finalChar = testChar+finalChar;
		}
		System.out.println("Common suffix"+finalChar);
		for(String x:str){
			System.out.println(x);
		}
		//testChar = testChar + str[str.length()-1].substring(str[length()-1].length()-2,s.length()-1);
//		int lastIndex = str[0].length()-1;
/*		for(int j = lastIndex;j>=0;j--){
			testChar = testChar + str[0].substring(lastIndex -1,lastIndex);
			for(String s:str){
				if(s.substring(lastIndex - 1,lastIndex).compareTo(testChar)==0){
					continue;
			}
			else{
				System.out.println(testChar);
				break;
			}
		}
		lastIndex = lastIndex-1;
		
	}
	System.out.println(testChar); */
}
}