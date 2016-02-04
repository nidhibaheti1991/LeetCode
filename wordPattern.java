public class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] patternArray = pattern.toCharArray();
        //Character[] patternArray = ArrayUtils.toObject(patternArr);
        boolean wordPattern = false;
        boolean exec = true;
        String[] strArray = str.split("\\s+");
        HashMap<Character,String> map = new HashMap<Character,String>();
        if(!(patternArray.length==strArray.length)){
            wordPattern = false;
            exec = false;
        }
        if(exec){
            for(int i = 0;i<pattern.length();i++){
                if(!map.containsKey(patternArray[i])&&!map.containsValue(strArray[i])){
                    map.put(patternArray[i],strArray[i]);
                    wordPattern = true;
                    continue;
                }
                else{
                    if(map.containsKey(patternArray[i])&&map.containsValue(strArray[i])&&map.get(patternArray[i]).equals(strArray[i])){
                        wordPattern = true;
                        continue;
                    }
                    else{
                        wordPattern = false;
                        break;
                    }
                }
            }
        }
        return wordPattern;
    }
}