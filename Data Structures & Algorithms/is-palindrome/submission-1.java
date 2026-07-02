class Solution {
    public boolean isPalindrome(String s) {
     

     char[]ss=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
     int  si=0;
     int ei=ss.length-1;

     while(si<=ei){
        if(ss[si]!=ss[ei]){
            return false;
        }else{
            si++;
            ei--;
        }
     }
        return true;
    }
}
