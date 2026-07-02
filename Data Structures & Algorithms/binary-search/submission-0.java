class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
     while(si<=ei){
            int mid=si+(ei-si)/2;
            if(target==nums[mid]){
            return mid;
            }
            if(nums[mid]<target){
                si=mid+1;
            }else{
                ei=mid-1;
            }   
        }
        return -1;
    }
}
