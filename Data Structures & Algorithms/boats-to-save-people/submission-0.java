class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int si =0;
        int ei =people.length-1;
        int count =0;

        Arrays.sort(people);

        while(si<=ei){
           
            if(people[si]+people[ei]<=limit){
                count++;
                si++;
                ei--;
            
            }else{
                if(si<=ei){
                    count++;
                    ei--;
                }
                
            }
            
        }
        return count;
    }
}