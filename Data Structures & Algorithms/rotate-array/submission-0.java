class Solution {
      public void swapNum(int[] nums, int si ,int ei) {
        //swap
        while(si<ei){
        int temp = nums[si];
        nums[si]=nums[ei];
        nums[ei]=temp;

        si++;
        ei--;
        }

        
    }

    public void rotate(int[] nums, int k) {

        int n=nums.length;
        //base case 
        if(k%n==0){
            return;
        }

        k=k%n;
        swapNum(nums,0,n-1);
        swapNum(nums,0,k-1);
        swapNum(nums,k,n-1);

        
    }
}