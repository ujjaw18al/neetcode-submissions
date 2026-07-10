class Solution {
    public boolean isValid(String s) {
        char[] charS = s.toCharArray();
        Stack<Character>ss = new Stack<>();

        for(int i=0; i<charS.length; i++){
            char ch = charS[i];

            if(ch =='(' || ch =='[' || ch =='{'){
                ss.push(ch);
            }
            if(ch==')'){
                if(ss.isEmpty() || ss.peek()!='('){
                   return false;
                } 
                ss.pop();
            } else if(ch=='}'){
                if(ss.isEmpty() || ss.peek()!='{'){
                    return false;
                }
                 ss.pop();
            }else if(ch==']'){
                if(ss.isEmpty() || ss.peek()!='['){
                    return false;
                }
                 ss.pop();
            }

          
        }
        
          return ss.isEmpty();
    }
}
