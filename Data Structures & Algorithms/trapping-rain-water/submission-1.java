class Solution {
    public int trap(int[] height) {
        int water=0;
        int l_max=0;
        int r_max=0;
        int s=0;
        int e=height.length-1;
       while(s<e){
        if(height[s]<height[e]){
            l_max=Math.max(l_max,height[s]);
            water+=l_max-height[s];
            s++;
        }
        else{
            r_max=Math.max(r_max,height[e]);
            water+=r_max-height[e];
            e--;
        }
       }
       return water;
    }
}
