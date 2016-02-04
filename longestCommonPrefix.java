public class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean found = false;
        int prefixLength = 0;
        String prefix = "";
        if(strs.length==0 || strs[0].length()==0) return "";
        if(strs.length==1) return strs[0];
        for(int i=1;i<=strs[0].length();i++){
            prefix = strs[0].substring(0,i);
            for(int j = 1;j<strs.length;j++){
                 if(strs[j].length()==0) {
                    return "";
                 }
                if(strs[j].length()>=i){
                    if(strs[j].substring(0,i).compareTo(prefix)==0){
                        prefixLength = prefix.length();
                        continue;
                    }
                    else{
                        prefixLength = i-1;
                        found = true;
                        break;
                    }
                }
                else{
                    prefixLength = i-1;
                    found = true;
                    break; 
                }
            }
            if(found)
                break;
        }
        if(prefixLength!=0){
            return strs[0].substring(0,prefixLength);
        }
        else{
            return "";
        }
    }
}