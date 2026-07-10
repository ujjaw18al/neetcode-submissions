class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> s= new Stack<>();
       int ans=0;

       for(int i=0; i<tokens.length;i++){
        String chr =tokens[i];

        if(chr.equals("+") ||
           chr.equals("-") ||
           chr.equals("*") ||
           chr.equals("/") ){
                String oprator =chr;
                int b=s.pop();
                int a= s.pop();
                if(oprator.equals("+")){
                    ans =a +b;
                    s.push(ans);
                }else if(oprator.equals("-")){
                    ans =a - b;
                    s.push(ans);
                }else if(oprator.equals("*")){
                    ans =a * b;
                    s.push(ans);
                }else if(oprator.equals("/")){
                    ans =a / b;
                    s.push(ans);
                }else{
                    ans =s.pop();
                }
             }else{
                int num = Integer.parseInt(chr);
                s.push(num);

            }
        } return ans ;
    }
}
