class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb  = new StringBuilder("");
        //sort
        Arrays.sort(strs);
        // first and last string
       char [] first = strs[0].toCharArray();
       char [] last = strs[strs.length-1].toCharArray();

       for(int i= 0; i<first.length; i++){
        if(first[i]!= last[i])
        break;
        sb.append(first[i]);

       } return sb.toString();

    }
}