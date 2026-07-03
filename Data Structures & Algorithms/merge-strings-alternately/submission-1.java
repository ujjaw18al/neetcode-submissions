class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] char1=word1.toCharArray();
        char[] char2=word2.toCharArray();
        int n=char1.length +char2.length;

        char[]answer= new char[n];
        int i =0;
        int j=0;
        int k=0;

        while(i<char1.length && j<char2.length){
            answer[k]=char1[i];
            i++;
            k++;
            answer[k]=char2[j];
            j++;
            k++;
        }

        while(i<char1.length){
            answer[k++]=char1[i++];
        }
        while(i<char2.length){
            answer[k++]=char2[i++];
        }

        return new String(answer);
    }
}