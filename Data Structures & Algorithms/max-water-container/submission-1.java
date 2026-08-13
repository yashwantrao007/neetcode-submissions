class Solution {
    public int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length-1;

        int ans = 0;

        while(l<r){
            int hight = Math.min(heights[l],heights[r]);
            int width = r-l;

            ans = Math.max(ans, hight*width);

            if(heights[l]>heights[r]){
                r--;
            }else{
                l++;
            }
        }

        return ans;
        
    }
}
