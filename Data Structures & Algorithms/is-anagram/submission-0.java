class Solution {
    public boolean isAnagram(String s, String t) {
        //length campare 
        if(s.length() !=t.length()){
            return false ;
        }
        //convert to arry
        char sArr [] = s.toCharArray();
        char tArr [] = t.toCharArray();

        //sort
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        //compare
        return Arrays.equals(sArr ,tArr);
    }
}
