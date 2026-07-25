class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxArea=0;
        while(l<r){
            int width=r-l;
            int ar=Math.min(heights[l],heights[r])*width;
            maxArea=Math.max(ar,maxArea);
            if(heights[l]<heights[r])
            l++;
            else
            r--;
        }
        return maxArea;
    }
}
