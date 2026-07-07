class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left =0;
        int right =n-1;
        int max_area=0;

        while(left<right){
             int min_height = Math.min(heights[left],heights[right]);
             int wirdth = right-left;
             int area = min_height * wirdth;

             max_area =Math.max(max_area , area);
                
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }     

        }

        return  max_area;
    }
}
