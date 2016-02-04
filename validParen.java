public class Solution {
    public boolean isValid(String s) {
        boolean returnValue = true;
        HashMap<String,String> map = new HashMap<String,String>();
        if(s.length()==1) return false;
        map.put("(",")");
        map.put("[","]");
        map.put("{","}");
        
        Stack<String> stack = new Stack<String>();
       /* for(int i = 0;i<s.length();i++){
            String bracket = s.substring(i,i+1);
            if(map.containsKey(bracket)){
                stack.push(bracket);
            }
            else{
                String openBracket="";
                if(!stack.empty()){
                    openBracket = stack.pop();
                }
                else{
                    return false;
                }
                if(map.get(openBracket).compareTo(bracket)==0){
                    returnValue = true;
                }
                else{
                    returnValue = false;
                }
            }
          
        }
      if(!stack.empty()) return false;  
      return returnValue;   */
      for(int i=0;i<s.length();i++){
          String bracket = s.substring(i,i+1);
          if(map.containsKey(bracket)){
              stack.push(bracket);
          }
          else{
              if(stack.empty()) return false;
              String top = stack.peek();
              if(map.get(top).compareTo(bracket)==0){
                  stack.pop();
              }
              else{
                  return false;
              }
          }
      }
      if(stack.empty()){
          return true;
      }
      else{
          return false;
      }
    }
}